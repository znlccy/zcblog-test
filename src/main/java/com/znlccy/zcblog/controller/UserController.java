package com.znlccy.zcblog.controller;

import com.znlccy.zcblog.domain.User;
import com.znlccy.zcblog.service.UserService;
import com.znlccy.zcblog.util.SnowFlakeIdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: znlccy
 * version: 1.0.0
 * date: 12/19/18-1:52 AM
 * comment: 用户控制器
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    @ResponseBody
    public String login(@RequestParam("username")String username, @RequestParam("password")String password) {

        User user = new User();
        SnowFlakeIdGenerator generator = new SnowFlakeIdGenerator(1,1);
        user.setUserId(generator.nextId());
        user.setUsername(username);
        user.setPassword(password);

        int result = userService.saveUser(user);

        log.info("插入结果是= {}" , result);

        return "测试";
    }

}

