package com.study.springcloud.dubbo.user.core.repository;


import com.study.springcloud.dubbo.user.core.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chai
 * @description 用户仓库类
 * @date 2019/1/11 上午10:36
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
