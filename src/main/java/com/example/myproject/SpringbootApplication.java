package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import controller.TestController;

@SpringBootApplication
//使用ComponentScan注解指定具体的加载包
@ComponentScan(basePackages = "com.example")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    //Bean注解来初始化
    @Bean
    public TestController testController(){
        return new TestController();
    }
}
