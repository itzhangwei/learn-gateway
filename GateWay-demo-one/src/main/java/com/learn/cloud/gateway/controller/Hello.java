package com.learn.cloud.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zack.zhang
 * @projectName learn-gateway
 * @title Hello
 * @package com.learn.cloud.gateway.controller
 * @description
 * @date 2019-08-02 14:31
 */
@RestController
public class Hello {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/hello")
    public String hello(){
        return "hi，this is project name is " +appName;
    }
}
