package com.yusys.bbs;

import com.yusys.bbs.entity.User;
import com.yusys.bbs.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BbsApplication.class)
public class BbsApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void test() {
       // User user = userService.selectUserByTel("13260906172");
    }

}
