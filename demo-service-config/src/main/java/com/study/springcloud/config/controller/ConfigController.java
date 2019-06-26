package com.study.springcloud.config.controller;

import com.study.springcloud.config.client.ConfigClient;
import com.study.springcloud.config.entity.ConfigProperty;
import com.study.springcloud.config.repository.ConfigPropertyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chai
 * @description 配置中心控制层
 * @date 2019/5/14 7:48 PM
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private ConfigClient configClient;

    @Autowired
    private ConfigPropertyRepository configPropertyRepository;

    @GetMapping("/refresh")
    public boolean refresh() {
        configClient.refreshConfig();
        return true;
    }

    @PostMapping("/edit")
    public ConfigProperty edit(@RequestBody ConfigProperty configProperty) {
        return configPropertyRepository.save(configProperty);
    }
}
