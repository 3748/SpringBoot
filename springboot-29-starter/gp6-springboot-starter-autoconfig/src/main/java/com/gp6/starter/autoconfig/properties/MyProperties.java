package com.gp6.starter.autoconfig.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 读取所有gp6.spring配置
@ConfigurationProperties(prefix = "gp6.spring")
public class MyProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
