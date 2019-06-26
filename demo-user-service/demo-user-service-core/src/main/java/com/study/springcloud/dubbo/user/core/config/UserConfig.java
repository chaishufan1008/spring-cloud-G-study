package com.study.springcloud.dubbo.user.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

import lombok.Data;

/**
 * @author chai
 * @description 配置中心的属性 - 用户配置
 * @date 2019/5/14 5:06 PM
 */
@Component
@ConfigurationProperties(prefix = "demo.user")
@Data
public class UserConfig implements Serializable {

    private String testKey1;

    private String testKey2;

    private int num;
//
//    @RefreshScope //自动获取更新配置中心的配置
//    public String getTestKey1() {
//        return testKey1;
//    }
}
