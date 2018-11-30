package com.gp6.springboot18.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    /*
       访问
           当前项目(localhost:8080)
           或
           localhost:8080/index.htm
       都会被模板引擎自动解析,查找templates/index.html

    */
    @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";
    }
}
