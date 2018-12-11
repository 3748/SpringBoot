package com.gp6.springboot25.mapper;

import com.gp6.springboot25.bean.Cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CartMapper {
    @Select("select * from m_cart where id = #{id}")
    Cart selectCartById(int id);

    /*
        useGeneratedKeys: 是否使用自动生成的主键
        keyProperty:      主键对应属性
    */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into m_cart values(#{cart})")
    int insertCart(Cart cart);
}
