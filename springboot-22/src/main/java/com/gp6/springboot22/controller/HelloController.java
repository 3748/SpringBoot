package com.gp6.springboot22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","看什么?6,你和我,走一波!");
        return "success";
    }
}
