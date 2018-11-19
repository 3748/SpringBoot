package com.gp6.springboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
    代码说明：
        1、@SpringBootApplication：SpringBoot的核心注解,负责开启自动配置
        2、@Configuration：这是一个配置Spring的配置类；
        3、@Controller：标明这是一个SpringMVC的Controller控制器；
        4、main方法：在main方法中启动一个应用，即：应用的入口
 */
@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello world！";
    }

    public static void main(String[] args) {
        // 运行的类必须包含@SpringBootApplication
        SpringApplication.run(HelloApplication.class, args);
    }
}
