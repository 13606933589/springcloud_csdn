package com.yusys.bbs.controller;

import com.yusys.bbs.entity.User;
import com.yusys.bbs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * 2019/10/22.
 */
@Controller
public class UserController {
    @Resource
    private RedisTemplate redisTemplate;
    @Autowired
    private UserService userService;

    public String login(String tel, String passWord, HttpServletRequest request) {
        /*User user = new User();
        user.setTel(tel);
        user.setPassword(passWord);*/
        //判断用户是否存在
        User existUser = userService.selectUserByTel(tel);

        if (existUser == null) {
            return "{\"errorCode\":\"11\",\"errorMessage\":\"该用户不存在\"}";
        }
        //得到用户的全部数据
        User user = userService.selectUser(tel, passWord);
        int count = redisTemplate.opsForValue().get("错误登录" + tel) == null ?
                0 : (int) redisTemplate.opsForValue().get("错误登录" + tel);
        if (user != null && count < 3) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            redisTemplate.delete("错误登录" + tel);
            return "{\"errorCode\":\"00\",\"errorMessage\":\"登录成功！\"}";
        } else if (count >= 3) {
            String result = "{\"errorCode\":\"33\",\"errorMessage\":\"您由于错误登录次数太多，系统已将您的账户锁定，请在三分钟后重新登录！\"}";
            count++;
            //存放进缓存， 刷新时间
            redisTemplate.opsForValue().set("错误方式" + tel, count, 180, TimeUnit.SECONDS);
            return result;
        } else {
            String result = "{\"errorCode\":\"22\",\"errorMessage\":\"密码输入错误，错误输入三次后您的账户将会被锁定！\"}";
            count++;
            //这里的作用主要是考虑到用户只输错一次，在很长一段时间（姑且认为是一分钟至三分钟内）没有再次登陆，
            //为了用户的体验，决定在这个时候将其错误登录记录清除
            redisTemplate.opsForValue().set("错误登录" + tel, count, 60, TimeUnit.SECONDS);
            return result;
        }

    }
}
