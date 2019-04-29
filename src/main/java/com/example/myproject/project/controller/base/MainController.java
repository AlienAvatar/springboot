package com.example.myproject.project.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/dva", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String test(){
        return "dva";
    }
}
