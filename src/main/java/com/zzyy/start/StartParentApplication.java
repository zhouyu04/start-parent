package com.zzyy.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.annotation.ManagedBean;


@SpringBootApplication
@MapperScan("com.zzyy.start.mapper")
@EnableCaching
public class StartParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartParentApplication.class, args);
    }

}
