package com.example.myproject.project.controller.base;

import com.example.myproject.project.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/register")
    public String test(){
        return "register";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("user")String user,
                        @RequestParam("password")String password,
                        @RequestParam("email")String email){
        int re = loginService.insertLogin(user,password,email);
        if(re > 0){
            return "success";
        }else{
            return "user";
        }
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    @ResponseBody
    public String main(@RequestParam("user")String user,
                       @RequestParam("password")String password){
        int re = loginService.selectLogin(user,password);
        if(re > 0) {
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/loginIn")
    public String loginIn(){
        return "main";
    }
}
