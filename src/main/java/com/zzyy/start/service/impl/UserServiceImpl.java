package com.zzyy.start.service.impl;

import com.zzyy.start.entity.User;
import com.zzyy.start.mapper.UserMapper;
import com.zzyy.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<User> list() {
        List<User> list = userMapper.list();
        return list;
    }

    @Override
    public User queryByName(String name) {

        User user = userMapper.queryByName(name);


        return user;
    }
}
