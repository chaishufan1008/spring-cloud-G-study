package com.study.springcloud.dubbo.user.core;

import com.study.springcloud.dubbo.user.core.entity.User;
import com.study.springcloud.dubbo.user.core.repository.UserRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * @author chai
 * @description 用户服务启动类
 * @date 2019/4/15 11:40 AM
 */
@SpringBootApplication
public class UserServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    ApplicationRunner userInit(UserRepository userRepository) {
        return args -> {
            User user1 = User.builder().id(1L).username("user1").name("张三").age(21).balance(new BigDecimal(3000)).build();
            User user2 = User.builder().id(2L).username("user2").name("李四").age(22).balance(new BigDecimal(4000)).build();
            User user3 = User.builder().id(3L).username("user3").name("王五").age(23).balance(new BigDecimal(4000)).build();

            Stream.of(user1, user2, user3)
                  .forEach(userRepository::save);
        };
    }
}
