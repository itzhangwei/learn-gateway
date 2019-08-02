package com.learn.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zack.zhang
 * @projectName learn-gateway
 * @title ApplicationGateWayOne
 * @package com.learn.cloud.gateway
 * @description
 * @date 2019-08-01 19:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationGateWayOne {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationGateWayOne.class, args);
    }
}
