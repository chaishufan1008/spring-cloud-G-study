package com.study.springcloud.config.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chai
 * @description 配置信息详情
 * @date 2019/5/14 11:47 AM
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigProperty implements Serializable {
    @Id
    private Integer id;
    private String key;
    private String value;
    private String application;
    private String profile;
    private String label;
}
