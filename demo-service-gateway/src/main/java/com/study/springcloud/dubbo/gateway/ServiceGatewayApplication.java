package com.study.springcloud.dubbo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chai
 * @description 网关启动类
 * @date 2019/4/15 4:20 PM
 */
@SpringBootApplication
public class ServiceGatewayApplication {

    public static void main(String... args) {
        SpringApplication.run(ServiceGatewayApplication.class, args);
    }
}
