package com.gp6.springboot08.config;

import com.gp6.springboot08.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    注解@Configuration:
        指明当前类是一个配置类,就是来替代之前的Spring配置文件
 */
@Configuration
public class SpringBootConfig {
    /*
         在配置文件中用<bean><bean/>标签添加组件

         @Bean等效

         将方法的返回值添加到容器中;
     */
    @Bean
    public UserService userServiceConfig(){
        System.out.println("配置类@Bean向容器中添加组件...");
        return new UserService();
    }
}
