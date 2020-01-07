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
//        转发到一个视图
        return "login";

//        转发到一个请求方法（同一个控制器类内可以省略 /index/）
//        return "forward:/index/isLogin";

    }

    /**
     * @return
     */
    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }

    public String isLogin(){
//        重定向到一个请求方法
        return "redirect:/index/isRegister";
    }
}
