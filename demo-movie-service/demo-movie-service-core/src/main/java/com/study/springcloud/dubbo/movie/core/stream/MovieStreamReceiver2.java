package com.study.springcloud.dubbo.movie.core.stream;

import com.study.springcloud.dubbo.user.api.stream.DemoChannel;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chai
 * @description 电影消息消费者
 * @date 2019/4/16 7:21 PM
 */
//@EnableBinding({Sink.class, DemoChannel.class})
@Slf4j
public class MovieStreamReceiver2 {

    @StreamListener(Sink.INPUT)
    public void messageHandle(Object payload) {
        log.info("Movie2 message handler received: {}", payload);
    }

    @StreamListener(DemoChannel.INPUT)
    public void messageHandle2(Object payload) {
        log.info("Movie2 message handler2 received: {}", payload);
    }
}
