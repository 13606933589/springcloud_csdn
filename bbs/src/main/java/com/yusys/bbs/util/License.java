package com.yusys.bbs.util;

import com.yusys.bbs.entity.Role;
import com.yusys.bbs.entity.Role_per;
import com.yusys.bbs.entity.User;
import com.yusys.bbs.entity.User_role;
import com.yusys.bbs.service.RoleService;
import com.yusys.bbs.service.Role_perService;
import com.yusys.bbs.service.UserService;
import com.yusys.bbs.service.User_roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class License {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    Role_perService role_perService;

    @Autowired
    User_roleService user_roleService;

    public boolean hasArticlePermission(String permission, User user) {
        int id = user.getId();
        System.out.println(id);
        User_role user_role = user_roleService.queryByUserId(id);
        Role role = roleService.selectRoleById(user_role.getRoleid());
        System.out.println(role.getId());
        List<Role_per> list = role_perService.selectPermission(role.getId());
        List list1 = new ConvertRole().toList(list);
        System.out.println("我的权限列表：");
        for (Object str : list1) {
            System.out.println(str);
        }
        if (list1.contains(permission))
            return true;
        return false;
    }
}
