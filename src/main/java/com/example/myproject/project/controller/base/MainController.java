package com.example.myproject.project.controller.base;

import com.example.myproject.common.WebResponse;
import com.example.myproject.project.service.impl.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/dva", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String dva(){
        return "dva";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/getList",method = RequestMethod.POST)
    @ResponseBody
    public WebResponse getDvaList(){
        playerService.getAllPlayers();
        return new WebResponse();
    }
}
