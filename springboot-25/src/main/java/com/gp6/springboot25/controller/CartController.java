package com.gp6.springboot25.controller;

import com.gp6.springboot25.bean.Cart;
import com.gp6.springboot25.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    CartMapper cartMapper;

    @GetMapping("/cart/{id}")
    public Cart selectCartById(@PathVariable("id") Integer id) {
        return cartMapper.selectCartById(id);
    }
}
