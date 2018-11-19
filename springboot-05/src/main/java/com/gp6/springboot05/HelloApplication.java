package com.gp6.springboot05;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HelloApplication.class);
        // 关闭banner
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run();
    }
}
