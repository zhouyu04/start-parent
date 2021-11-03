package com.zzyy.start.mapper;

import com.zzyy.start.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "user")
@Mapper
public interface UserMapper {

    @Cacheable(key = "all")
    List<User> list();

    @Cacheable(cacheNames = "user",key = "#name")
    User queryByName(String name);

}
