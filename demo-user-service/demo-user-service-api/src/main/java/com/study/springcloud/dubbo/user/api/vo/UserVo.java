package com.study.springcloud.dubbo.user.api.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * @author chai
 * @description 用户视图类
 * @date 2019/4/15 2:36 PM
 */
@Data
public class UserVo implements Serializable{

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
