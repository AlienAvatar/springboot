package com.example.myproject.project.controller.base;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello Java";
    }

    @RequestMapping("/index")
    public String test(){
        return "index";
    }
}
