package com.study.springcloud.dubbo.user.api.stream;

import com.study.springcloud.dubbo.user.api.constant.UserStreamConstant;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author chai
 * @description TODO 简单介绍该类
 * @date 2019/4/17 5:56 PM
 */
public interface DemoChannel {

    String INPUT = UserStreamConstant.CHANNEL_NAME;

    @Input(DemoChannel.INPUT)
    SubscribableChannel input();

}
