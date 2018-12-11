package com.gp6.springboot25.config;


import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {

        /*return new ConfigurationCustomizer() {

            @Override
            public void customize(Configuration configuration) {
                // 开启驼峰命名法映射规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };*/

        // 下面代码是lambda表达
        return configuration -> {
            // 开启驼峰命名法映射规则
            configuration.setMapUnderscoreToCamelCase(true);
        };
    }
}
