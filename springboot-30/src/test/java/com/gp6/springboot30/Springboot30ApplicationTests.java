package com.gp6.springboot30;

import com.gp6.springboot30.enums.RedisKeyEnum;
import com.gp6.springboot30.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot30ApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
        redisUtil.set(RedisKeyEnum.KEY,"23");
    }

}

