package com.gp6.springboot01.service;

import com.gp6.springboot01.bean.User;
import com.gp6.springboot01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // 注入Spring容器中的bean对象
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserList() {
        // 调用userMapper的方法进行查询
        return userMapper.queryUserList();
    }
}
