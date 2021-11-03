package com.zzyy.start.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "mrbird.blog")
@Data
@Configuration
public class ConfigBean {

    private String name;

    private String title;

}
