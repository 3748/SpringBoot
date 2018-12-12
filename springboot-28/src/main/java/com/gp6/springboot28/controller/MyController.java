package com.gp6.springboot28.controller;

import com.gp6.starter.autoconfig.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/test")
    public String test(){
        return myService.sayHello("gp6");
    }
}
