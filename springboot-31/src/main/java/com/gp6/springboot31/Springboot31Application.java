package com.gp6.springboot31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

// 使用MapperScan批量扫描所有的Mapper接口,此时CartMapper上的mapper就可以注释
@MapperScan(value = "com.gp6.springboot31.mapper")
@SpringBootApplication
public class Springboot31Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot31Application.class, args);
    }
}
