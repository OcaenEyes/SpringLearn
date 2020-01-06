package com.gzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hi")
public class HiController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHi(Model model){
        model.addAttribute("message","hi,这是第一个SpringMVC");
        return "hi";
    }
}
