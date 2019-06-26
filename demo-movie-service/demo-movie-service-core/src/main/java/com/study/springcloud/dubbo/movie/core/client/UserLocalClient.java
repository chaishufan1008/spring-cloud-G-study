package com.study.springcloud.dubbo.movie.core.client;

import com.study.springcloud.dubbo.user.api.client.UserService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

import feign.Logger;

/**
 * @author chai
 * @description 用户服务本地客户端
 * @date 2019/5/23 7:32 PM
 */
@FeignClient(value = "demo-user-service", fallback = UserLocalClientFallBack.class, configuration = UserFeignConfig.class)
public interface UserLocalClient extends UserService {

}

class UserFeignConfig {
    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}
