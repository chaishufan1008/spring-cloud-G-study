package com.study.springcloud.dubbo.movie.core.controller;

import com.study.springcloud.dubbo.movie.core.client.UserLocalClient;
import com.study.springcloud.dubbo.user.api.client.UserService;
import com.study.springcloud.dubbo.user.api.vo.UserVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chai
 * @description 电影服务控制层
 * @date 2019/4/15 3:13 PM
 */

@RestController
@RequestMapping("/movie")
@Slf4j
public class MovieController {

    @Autowired
    private UserLocalClient userLocalClient;

    private UserService userService;

    @GetMapping("/user/{userId}")
    public UserVo findById(@PathVariable Long userId) {
        UserVo result = userLocalClient.findById(userId);

        log.info("call UserService finished, [result={}]", result);

        // run some code about movie ...
        return result;
    }

    @GetMapping("/user/feign/{userId}")
    public UserVo findByIdFeign(@PathVariable Long userId) {
        UserVo result = userLocalClient.findById(userId);

        log.info("call UserService finished, [result={}]", result);

        // run some code about movie ...
        return result;
    }

}
