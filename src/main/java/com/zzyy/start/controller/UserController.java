package com.zzyy.start.controller;

import com.zzyy.start.entity.User;
import com.zzyy.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
        List<User> list = userService.list();
        return list;

    }

    @RequestMapping("/queryByName")
    public User queryByName(String name){
        return userService.queryByName(name);
    }


}
