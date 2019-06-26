package com.study.springcloud.dubbo.user.core.controller;


import com.study.springcloud.dubbo.user.api.vo.UserVo;
import com.study.springcloud.dubbo.user.core.config.UserConfig;
import com.study.springcloud.dubbo.user.core.entity.User;
import com.study.springcloud.dubbo.user.core.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chai
 * @description 用户控制层
 * @date 2019/1/11 上午10:38
 */
//@RestController
@RequestMapping("user")
@Slf4j
@EnableBinding({Source.class})
@RefreshScope //自动更新配置中心的配置
public class UserController {

//    @Autowired
//    private UserService userClient;

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private DemoChannelSender demoChannelSender;

    @Value("${server.port}")
    private String server;

    @Autowired
    private UserConfig userConfig;

    @Value("${demo.user.testKey1:null}")
    private String testKey1;

    @GetMapping("/{id}")
    public Optional<UserVo> findById(@PathVariable Long id) {
        log.info("this is server at {}", server);
        User user = userRepository.findById(id).get();
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        Assert.notNull(userVo, "用户id不存在！");
        return Optional.of(userVo);
    }

    @GetMapping("test")
    public Object test() {
        String tests = "0.0005";
        return testKey1;
    }

    @GetMapping("test/config")
    @ResponseBody
    public UserConfig testConfig() {
        userConfig.setNum(userConfig.getNum() + 1);
        return userConfig;
    }

    @GetMapping("/login")
    public Boolean login(@RequestParam String name) {
//        demoChannelSender.output().send(MessageBuilder.withPayload(name).build());
        return Boolean.TRUE;
    }
}
