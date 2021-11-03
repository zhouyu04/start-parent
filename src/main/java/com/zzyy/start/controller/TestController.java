package com.zzyy.start.controller;


import com.zzyy.start.annotation.AopLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags ="Test控制器")
@RequestMapping("/test")
@RestController
public class TestController {

    @ApiOperation("one")
    @AopLog("方法一")
    @GetMapping("/one")
    public void methodOne(String name) {
        return;
    }

    @ApiOperation("one2")
    @AopLog("方法二")
    @GetMapping("/one2")
    public void method2(String name) throws InterruptedException {
        Thread.sleep(2000);
    }

    @ApiOperation("one3")
    @AopLog("方法三")
    @GetMapping("/one3")
    public void method3(String name, String age) {
        return;
    }


}
