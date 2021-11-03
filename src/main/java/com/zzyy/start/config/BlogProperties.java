package com.zzyy.start.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlogProperties {

    @Value("${mrbird.blog.name}")
     String name;

    @Value("${mrbird.blog.title}")
     String title;

    @Value("${server.dev}")
     String dev;

}
