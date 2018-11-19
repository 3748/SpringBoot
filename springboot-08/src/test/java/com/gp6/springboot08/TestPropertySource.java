package com.gp6.springboot08;

import com.gp6.springboot08.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPropertySource {
    @Autowired
    Person person;

    @Test
    public void test() {
        System.out.println(person);
    }
}
