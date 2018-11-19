package com.gp6.springboot08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestImportSource {
    @Autowired
    ApplicationContext ioc;

    @Test
    public void testUserService() {
        System.out.println(ioc.containsBean("userServiceBean"));
    }

    @Test
    public void testUserService2() {
        System.out.println(ioc.containsBean("userServiceConfig"));
    }
}
