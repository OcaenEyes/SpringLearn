package com.gzy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class IndexController {
    /**
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, Model model) {
        return "login";
    }

    /**
     * @return
     */
    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }
}
