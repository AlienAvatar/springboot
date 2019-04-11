package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello Java";
    }

    @RequestMapping("/test")
    public String test(){
        return "index";
    }
}
