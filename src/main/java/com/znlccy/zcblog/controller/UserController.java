package com.znlccy.zcblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: znlccy
 * version: 1.0.0
 * date: 12/19/18-1:52 AM
 * comment: 用户控制器
 */
@Controller
public class UserController {

    @GetMapping("/user/login")
    @ResponseBody
    public String login() {
        return "测试";
    }

}
