package com.gp6.springboot01.config;

import com.gp6.springboot01.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


/**
* 配置文件
*
* @author gp6
* @date 2018-11-15
*/
// 通过@ComponentScan注解来表明该类是一个Spring的配置，相当于一个xml文件
// 配置扫描包
@ComponentScan(basePackages = "com.gp6.springboot01")
public class SpringConfig {

    // 通过@Bean注解来表明是一个Bean对象，相当于xml中的<bean>
    @Bean
    public UserMapper getUserMapper(){
        // 直接new对象做演示
        return new UserMapper();
    }
}
