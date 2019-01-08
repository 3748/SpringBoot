package com.gp6.springboot31.bean;

import java.io.Serializable;

/**
 * 商品规格参数模板
 *
 * @author gp6
 * @date 2018-09-27
 */
public class ItemParamTemplate implements Serializable {
    private static final long serialVersionUID = -6243936334467602958L;
    /**
     *
     */
    private Long id;

    /**
     * 商品类目ID
     */
    private Long catId;

    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id 商品类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商品类目ID
     *
     * @return cat_id 商品类目ID
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * 商品类目ID
     *
     * @param catId 商品类目ID
     */
    public void setCatId(Long catId) {
        this.catId = catId;
    }

    /**
     * 参数数据，格式为json格式
     *
     * @return param_data 参数数据，格式为json格式
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 参数数据，格式为json格式
     *
     * @param paramData 参数数据，格式为json格式
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}