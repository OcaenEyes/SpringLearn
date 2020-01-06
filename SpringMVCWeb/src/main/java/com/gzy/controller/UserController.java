package com.gzy.controller;

import com.gzy.model.UserForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    //生成一个日志记录对象，标记打印的事哪个类的信息
    private static final Log logger = LogFactory.getLog(UserForm.class);

    /**
     * 处理登录  使用UserForm对象（实体Bean） ， user接收注册页面提交的请求参数
     *
     * @return
     */
    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model) {
        if ("gzy".equals(user.getName()) && "123456".equals(user.getPassword())) {
            session.setAttribute("user", user);
            logger.info("登录成功");
            return "main";
        } else {
            logger.info("登录失败");
            model.addAttribute("messageError", "用户名或密码错误");
            return "login";
        }
    }

    /**
     * 处理注册 使用UserForm对象（实体Bean）， user接收注册页面提交的请求参数
     *
     * @return
     */
    @RequestMapping("/register")
    public String register(UserForm user, Model model) {
        if ("gzy".equals(user.getName()) && "123456".equals(user.getPassword())) {
            logger.info("注册成功");
            return "login";
        } else {
            logger.info("注册失败");
            return "register";
        }
    }

}
