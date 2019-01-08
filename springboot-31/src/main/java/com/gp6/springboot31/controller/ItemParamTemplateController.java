package com.gp6.springboot31.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gp6.springboot31.bean.ItemParamTemplate;
import com.gp6.springboot31.mapper.ItemParamTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemParamTemplateController {

    @Autowired
    ItemParamTemplateMapper itemParamTemplateMapper;

    @GetMapping("/itemParamTemplate/{id}")
    public ItemParamTemplate selectItemParamTemplateById(@PathVariable("id") Integer id) {
        return itemParamTemplateMapper.selectItemParamTemplateById(id);
    }

    @GetMapping("/itemParamTemplate")
    public PageInfo<ItemParamTemplate> selectItemParamTemplateList() {
        PageHelper.startPage(1,5);
        return new PageInfo<>(itemParamTemplateMapper.selectAll());
    }
}
