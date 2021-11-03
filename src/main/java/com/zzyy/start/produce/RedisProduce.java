package com.zzyy.start.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisProduce {

    @Autowired
    RedisTemplate redisTemplate;


    public static final String BRANCK_KEY_PRE = "branch:pre:";

    public void produce(String branchId) {

        redisTemplate.opsForZSet().add(BRANCK_KEY_PRE+branchId,branchId,Double.valueOf(branchId));

    }


}
