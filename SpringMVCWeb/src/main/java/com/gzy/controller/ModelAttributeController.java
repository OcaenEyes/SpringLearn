package com.gzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("/admin")
public class ModelAttributeController {
    //    被ModelAttribute 注解到方法，每次在调用该控制器类的请求处理方法前被调用
    @ModelAttribute
    public void isLogin(HttpSession session) throws Exception {
        if (session.getAttribute("user") == null) {
            throw new Exception("没有权限,请登录");
        }
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete";
    }

}
