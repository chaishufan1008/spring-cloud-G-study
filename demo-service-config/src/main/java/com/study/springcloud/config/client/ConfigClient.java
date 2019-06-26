package com.study.springcloud.config.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author chai
 * @description 配置客户端
 * @date 2019/5/14 7:44 PM
 */
@FeignClient(value = "demo-service-config")
public interface ConfigClient {

    @PostMapping("/actuator/bus-refresh")
    void refreshConfig();
}
