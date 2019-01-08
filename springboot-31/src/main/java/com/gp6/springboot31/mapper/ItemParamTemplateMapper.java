package com.gp6.springboot31.mapper;

import com.gp6.springboot31.bean.ItemParamTemplate;
import com.gp6.springboot31.utils.MapperUtil;


public interface ItemParamTemplateMapper extends MapperUtil<ItemParamTemplate> {
    ItemParamTemplate selectItemParamTemplateById(int id);
}