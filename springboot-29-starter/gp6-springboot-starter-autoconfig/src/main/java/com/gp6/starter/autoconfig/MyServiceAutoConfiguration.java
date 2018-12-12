package com.gp6.starter.autoconfig;

import com.gp6.starter.autoconfig.properties.MyProperties;
import com.gp6.starter.autoconfig.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// web应用生效
@ConditionalOnWebApplication
@EnableConfigurationProperties(MyProperties.class)
public class MyServiceAutoConfiguration {

    @Autowired
    MyProperties myProperties;

    // 向容器中添加myService组件
    @Bean
    public MyService myService() {
        MyService service = new MyService();
        service.setMyProperties(myProperties);
        return service;
    }
}
