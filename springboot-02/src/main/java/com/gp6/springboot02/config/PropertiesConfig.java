package com.gp6.springboot02.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


/**
 * 配置文件
 *
 * @author gp6
 * @date 2018-11-15
 */
/*
    通过@PropertySource可以指定读取的配置文件，通过@Value注解获取值

    读取多个资源文件
        value = {"classpath:jdbc.properties","redis.properties"}

    在xml配置方式下读取外部资源文件,忽略没有找到的资源文件
        <property name="ignoreResourceNotFound" value="true"/>
*/
@PropertySource(value = {"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
public class PropertiesConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Value("${jdbc.username}")
    private String jdbcUserName;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    /*
        该种配置方式下,默认将方法名作为bean的id

        <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource" init-method="init" destroy-method="close">
            <property name="driverClassName" value="${jdbc.driverClassName}"/>
            <property name="url" value="${jdbc.master.url}"/>
            <property name="username" value="${jdbc.username}"/>
            <property name="password" value="${jdbc.password}"/>
            ......
     */
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        // 相应驱动的jdbcUrl
        druidDataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        druidDataSource.setUsername(jdbcUserName);
        // 数据库的密码
        druidDataSource.setPassword(jdbcPassword);
        // 数据库驱动
        druidDataSource.setDriverClassName(jdbcDriverClassName);
        return druidDataSource;
    }
}
