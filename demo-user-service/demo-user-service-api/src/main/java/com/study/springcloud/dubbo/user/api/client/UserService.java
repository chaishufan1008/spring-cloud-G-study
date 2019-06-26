package com.study.springcloud.dubbo.user.api.client;

import com.study.springcloud.dubbo.user.api.vo.UserVo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chai
 * @description 用户服务客户端
 * @date 2019/4/15 2:36 PM
 */
public interface UserService {

    @GetMapping("/user/{id}")
    UserVo findById(@PathVariable("id") Long id);
}
