package com.gzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloSpringMVC {

    @RequestMapping("/mvc")
    public String HelloMVC(){
        return "home";
    }
}
