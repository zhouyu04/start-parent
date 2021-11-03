package com.zzyy.start.service;

import com.zzyy.start.entity.User;

import java.util.List;

public interface UserService {
    List<User> list();

    User queryByName(String name);
}
