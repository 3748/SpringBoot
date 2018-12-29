package com.gp6.springboot30.enums;

/**
 * Redis key
 *
 * @author gp6
 * @date 2018-12-28
 */
public enum RedisKeyEnum {
    /**
     * Redis定义key的规则:项目名_模块名_业务名
     */
    KEY("KEY", "Redis的Key");


    RedisKeyEnum(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    private String key;

    private String desc;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }}
