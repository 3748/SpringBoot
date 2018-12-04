package com.gp6.springboot18.controller;


import com.gp6.springboot18.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /*
        测试自定义异常
    */
    @RequestMapping({"testException"})
    @ResponseBody
    public String testException(@RequestParam("userName") String userName){
       if("gp6".equals(userName)){
            throw  new UserNotExistException();
       }
       return "测试自定义异常";
    }
}
