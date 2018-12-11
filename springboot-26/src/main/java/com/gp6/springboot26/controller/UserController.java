package com.gp6.springboot26.controller;

import com.gp6.springboot26.bean.User;
import com.gp6.springboot26.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        // getOne查询结果为null,原因未知
        User user1 = userRepository.getOne(id);
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @PostMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }

}
