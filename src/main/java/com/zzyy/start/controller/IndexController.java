package com.zzyy.start.controller;

import com.zzyy.start.config.BlogProperties;
import com.zzyy.start.config.ConfigBean;
import com.zzyy.start.config.TestConfigBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Index控制器")
@RestController
@RequestMapping("/index")
@Slf4j
public class IndexController {

    @Autowired
    BlogProperties blogProperties;

    @Autowired
    ConfigBean configBean;

    @Autowired
    TestConfigBean testConfigBean;

    @ApiOperation("index")
    @GetMapping("/property")
    public String index() {

        return blogProperties.getDev() + "==>" + blogProperties.getName() + "——" + blogProperties.getTitle();
    }


    @ApiOperation("index2")
    @GetMapping("/property2")
    public String index2() {

        log.info("property2 ==>name:{},title:{}", configBean.getName(), configBean.getTitle());
        return configBean.getName() + "——" + configBean.getTitle();
    }


    @ApiOperation("index3")
    @GetMapping("/property3")
    public String index3() {

        log.info("property3 ==>name:{},age:{}", testConfigBean.getName(), testConfigBean.getAge());
        return testConfigBean.getName() + "——" + testConfigBean.getAge();
    }


}
