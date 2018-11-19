package com.gp6.springboot07;

import com.gp6.springboot07.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestYml {
    @Autowired
    Person person;

    @Test
    public void test() {
        System.out.println(person);
    }
}
