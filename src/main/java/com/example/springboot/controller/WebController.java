package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能：提供接口返回数据
 * 作者：俞凌志
 * 日期： Result Result
 */
@RestController
public class WebController {

    @Resource
    UserService userService;

    @GetMapping("/")
    public Result hello() {
        return Result.success("success");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null) {
            return Result.error("输入数据不合法");
        }
       user = userService.login(user);
        return Result.success(user);
    }
}
