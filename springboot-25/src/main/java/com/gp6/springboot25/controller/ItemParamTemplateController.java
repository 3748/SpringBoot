package com.gp6.springboot25.controller;

import com.gp6.springboot25.bean.ItemParamTemplate;
import com.gp6.springboot25.mapper.ItemParamTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemParamTemplateController {

    @Autowired
    ItemParamTemplateMapper itemParamTemplateMapper;

    @GetMapping("/itemParamTemplate/{id}")
    public ItemParamTemplate selectCartById(@PathVariable("id") Integer id) {
        return itemParamTemplateMapper.selectItemParamTemplateById(id);
    }
}
