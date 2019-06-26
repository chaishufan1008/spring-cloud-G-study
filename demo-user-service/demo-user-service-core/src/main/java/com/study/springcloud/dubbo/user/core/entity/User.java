package com.study.springcloud.dubbo.user.core.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chai
 * @description 用户实体类
 * @date 2019/1/11 上午10:27
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String name;

    private Integer age;

    @Column(precision = 16, scale = 2)
    private BigDecimal balance;

    @Transient
    private String server;
}
