package com.study.springcloud.config;

import com.study.springcloud.config.entity.ConfigProperty;
import com.study.springcloud.config.repository.ConfigPropertyRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

/**
 * @author chai
 * @description 配置中心启动类
 * @date 2019/5/14 11:44 AM
 */
@SpringBootApplication
@EnableConfigServer
@EnableFeignClients(basePackages = {"com.study.springcloud.config"})
public class ConfigApplication {

    public static void main(String... args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @Bean
    ApplicationRunner userInit(ConfigPropertyRepository configPropertyRepository) {
        return args -> {
            ConfigProperty.ConfigPropertyBuilder builder = ConfigProperty.builder()
                    .application("demo-user-service").profile("develop").label("test");

            ConfigProperty property1 = builder.id(1).key("demo.user.testKey1").value("value1").build();
            ConfigProperty property2 = builder.id(2).key("demo.user.testKey2").value("value2").build();
            ConfigProperty property3 = builder.id(3).key("demo.user.testKey3").value("value3").build();

//            ConfigProperty property4 = builder.profile("default").id(4).key("testKey4").value("value4").build();

            Stream.of(property1, property2, property3)
                  .forEach(configPropertyRepository::save);
        };
    }
}
