package com.example;

import com.example.myproject.project.controller.base.LoginController;
import com.example.myproject.project.controller.base.TestController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//如何扫描到dao层
@SpringBootApplication
//使用ComponentScan注解指定具体的加载包
@MapperScan("com.example.myproject.*.dao")
@ComponentScan(basePackages={"com.example.myproject"})
public class SpringbootApplication {

    public static void main(String[] args) {
        //热部署
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
