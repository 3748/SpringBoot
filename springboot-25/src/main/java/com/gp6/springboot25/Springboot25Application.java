package com.gp6.springboot25;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用MapperScan批量扫描所有的Mapper接口,此时CartMapper上的mapper就可以注释
@MapperScan(value = "com.gp6.springboot25.mapper")
@SpringBootApplication
public class Springboot25Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot25Application.class, args);
    }
}
