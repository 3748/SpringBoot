package com.gp6.springboot17.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/*
    实现WebMvcConfigurer可扩展SpringMVC(详见springboot-18)

    使用WebMvcConfigurationSupport自定义SpringMVC的功能

    @EnableWebMvc: SpringBoot对SpringMVC自动配置全部失效(不推荐)
*/
//@EnableWebMvc
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    // 添加视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送 "/gp6" 请求,来到 success页面(由于页面不存在,500错误)
        registry.addViewController("/gp6").setViewName("success");
    }
}
