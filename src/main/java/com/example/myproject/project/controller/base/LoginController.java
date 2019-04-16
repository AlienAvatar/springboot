package com.example.myproject.project.controller.base;

import com.example.myproject.project.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/register")
    public String test(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        @RequestParam("email")String email){
        int re = loginService.insertLogin(username,password,email);
        if(re > 0){
            return "index";
        }else{
            return "register";
        }

    }
}
