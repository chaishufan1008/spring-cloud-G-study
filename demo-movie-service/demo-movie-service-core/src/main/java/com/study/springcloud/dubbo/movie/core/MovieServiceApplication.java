package com.study.springcloud.dubbo.movie.core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chai
 * @description 电影服务启动类
 * @date 2019/4/15 3:05 PM
 */
@SpringBootApplication(scanBasePackages = {"com.study.springcloud.dubbo"})
@EnableFeignClients
//@EnableFeignClients(basePackages = {"com.study.springcloud.dubbo"})
public class MovieServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }
}
