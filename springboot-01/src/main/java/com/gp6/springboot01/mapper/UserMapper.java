package com.gp6.springboot01.mapper;

import com.gp6.springboot01.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟Mapper，查询出数据
 *
 * @author gp6
 * @date 2018-11-15
 */
public class UserMapper {
    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username_" + i);
            result.add(user);
        }
        return result;
    }
}
