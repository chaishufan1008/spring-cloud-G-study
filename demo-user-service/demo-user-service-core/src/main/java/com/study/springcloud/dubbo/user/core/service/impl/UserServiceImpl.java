package com.study.springcloud.dubbo.user.core.service.impl;

import com.study.springcloud.dubbo.user.api.client.UserService;
import com.study.springcloud.dubbo.user.api.vo.UserVo;
import com.study.springcloud.dubbo.user.core.entity.User;
import com.study.springcloud.dubbo.user.core.repository.UserRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chai
 * @description 用户服务dubbo实现类
 * @date 2019/4/15 5:39 PM
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserVo findById(Long id) {

        log.info("dubbo service called.....");

        User user = userRepository.findById(id).get();
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return userVo;
    }
}
