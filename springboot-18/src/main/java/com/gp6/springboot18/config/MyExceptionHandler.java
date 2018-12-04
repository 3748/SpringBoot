package com.gp6.springboot18.config;

import com.gp6.springboot18.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    // 浏览器客户端返回的都是json
    @ResponseBody
    // 捕获UserNotExistException异常
    // @ExceptionHandler(UserNotExistException.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.notExist");
        map.put("message",e.getMessage());
        return map;
    }


    @ExceptionHandler(UserNotExistException.class)
    public String handleException2(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notExist");
        map.put("message","用户出错啦");

        request.setAttribute("ext",map);

        // 转发到/error
        return "forward:/error";
    }
}
