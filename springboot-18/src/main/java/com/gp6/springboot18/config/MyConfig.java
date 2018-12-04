package com.gp6.springboot18.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    /*
        所有的WebMvcConfigurer组件会一起生效
    */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*
            SpringBoot已配置静态资源映射,编写拦截器时,无需考虑静态资源
        */
        /*registry.addInterceptor(new MyHandlerInterceptor()).
                // 拦截的请求(/** : 所有)
                addPathPatterns("/**")

                // 放行的请求
                .excludePathPatterns("/login.html","/","/user/login","/asserts");*/
    }

    /*
        将自定义的区域信息解析器注入到容器中
    */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
