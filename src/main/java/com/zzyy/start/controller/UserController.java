package com.zzyy.start.controller;

import com.zzyy.start.entity.User;
import com.zzyy.start.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags ="User控制器")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("list")
    @GetMapping("/list")
    public List<User> list(){
        List<User> list = userService.list();
        return list;

    }

    @ApiOperation("queryByName")
    @GetMapping("/queryByName")
    public User queryByName(String name){
        return userService.queryByName(name);
    }


}
