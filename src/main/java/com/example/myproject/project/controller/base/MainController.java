package com.example.myproject.project.controller.base;

import com.alibaba.fastjson.JSON;
import com.example.myproject.common.StatusConstant;
import com.example.myproject.common.WebResponse;
import com.example.myproject.project.entity.Player;
import com.example.myproject.project.service.impl.PlayerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.List;

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
    public WebResponse getDvaList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize){

        String token = "";
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<Player> pageInfo = new PageInfo<>(playerService.getAllPlayers());
        //List<Player> list = playerService.getAllPlayers();
        String json = JSON.toJSONString(pageInfo);

        WebResponse response;
        if(pageInfo != null){
            response = new WebResponse().getWebResponse(StatusConstant.HTTP_OK_CODE,StatusConstant.HTTP_OK_MSG,json,token);
        }else{
            response = new WebResponse().getWebResponse(StatusConstant.SERVER_INTERNAL_ERROR_CODE,StatusConstant.SERVER_INTERNAL_ERROR_MSG,json,token);
        }
        return response;
    }
}
