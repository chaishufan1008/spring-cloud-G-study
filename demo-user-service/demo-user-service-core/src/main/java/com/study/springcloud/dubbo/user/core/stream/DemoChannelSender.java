package com.study.springcloud.dubbo.user.core.stream;

import com.study.springcloud.dubbo.user.api.constant.UserStreamConstant;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author chai
 * @description 消息发送演示
 * @date 2019/4/17 7:05 PM
 */
public interface DemoChannelSender {

    String OUTPUT = UserStreamConstant.CHANNEL_NAME;

    @Output(DemoChannelSender.OUTPUT)
    MessageChannel output();
}
