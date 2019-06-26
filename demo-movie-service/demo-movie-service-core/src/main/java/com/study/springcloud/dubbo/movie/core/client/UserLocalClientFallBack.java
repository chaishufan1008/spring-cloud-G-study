package com.study.springcloud.dubbo.movie.core.client;

import com.study.springcloud.dubbo.user.api.vo.UserVo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chai
 * @description TODO 简单介绍该类
 * @date 2019/5/23 7:34 PM
 */
@Slf4j
@Component
public class UserLocalClientFallBack implements UserLocalClient {

    @Override
    public UserVo findById(Long id) {
        log.error("[METHOD={}] 方法发生异常，进入Fallback方法，[id={}]", "UserLocalClient.findById", id);

        UserVo defaultUser = new UserVo();
        defaultUser.setAge(-2);
        defaultUser.setName("默认用户");
        defaultUser.setUsername("defaultUser2");
        defaultUser.setBalance(new BigDecimal(-2));
        return defaultUser;
    }
}
