package com.study.springcloud.config.repository;

import com.study.springcloud.config.entity.ConfigProperty;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chai
 * @description 配置信息DAO类
 * @date 2019/5/14 11:50 AM
 */
public interface ConfigPropertyRepository extends JpaRepository<ConfigProperty, Integer>{

}
