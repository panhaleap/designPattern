package com.designpattern.factorypattern;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldController {
    @RequestMapping("hello")
    public ModelAndView helloWorld(){
        String message = "Hello Spring MVC!";
        return new ModelAndView("hellopage", "message", message);
    }
}


