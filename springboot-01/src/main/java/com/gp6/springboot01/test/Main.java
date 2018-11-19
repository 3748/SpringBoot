package com.gp6.springboot01.test;

import com.gp6.springboot01.bean.User;
import com.gp6.springboot01.config.SpringConfig;
import com.gp6.springboot01.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
* 测试方法
*
* @author gp6
* @date 2018-11-15
*/
public class Main {
    public static void main(String[] args) {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 在Spring容器中获取Bean对象,SpringConfig中的扫描包必须包括UserService
        UserService userService = context.getBean(UserService.class);

        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername());
        }

        // 销毁容器
        context.destroy();
    }
}
