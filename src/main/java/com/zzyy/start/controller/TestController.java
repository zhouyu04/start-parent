package com.zzyy.start.controller;


import com.zzyy.start.annotation.AopLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @AopLog("方法一")
    @RequestMapping("/one")
    public void methodOne(String name) {
        return;
    }

    @AopLog("方法二")
    @RequestMapping("/one2")
    public void method2(String name) throws InterruptedException {
        Thread.sleep(2000);
    }

    @AopLog("方法三")
    @RequestMapping("/one3")
    public void method3(String name, String age) {
        return;
    }


}
