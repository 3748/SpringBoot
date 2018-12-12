package com.gp6.starter.autoconfig.service;

import com.gp6.starter.autoconfig.properties.MyProperties;

public class MyService {

    MyProperties myProperties;

    public MyProperties getHelloProperties() {
        return myProperties;
    }

    public void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    public String sayHello(String name) {
        return myProperties.getPrefix() + "-" + name + myProperties.getSuffix();
    }
}
