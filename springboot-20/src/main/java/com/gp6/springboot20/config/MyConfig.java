package com.gp6.springboot20.config;

import com.gp6.springboot20.filter.MyFilter;
import com.gp6.springboot20.listener.MyListener;
import com.gp6.springboot20.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyConfig {
    // 注册Servlet组件
    @Bean
    public ServletRegistrationBean myServlet() {
        // 映射 /myServlet 路径
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }

    // 注册Filter组件
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        // 拦截的请求
        registrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return registrationBean;
    }

    // 注册Listener组件
    @Bean
    public ServletListenerRegistrationBean myListener() {
        return new ServletListenerRegistrationBean<>(new MyListener());
    }

}
