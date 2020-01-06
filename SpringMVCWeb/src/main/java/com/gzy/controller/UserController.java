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
//通过处理方法的形参接收请求参数
//        通过处理方法的形参接收请求参数也就是直接把表单参数写在控制器类相应方法的形参中，即形参名称与请求参数名称完全相同。该接收参数方式适用于 get 和 post 提交请求方式。用户可以将“通过实体 Bean 接收请求参数”部分中控制器类 UserController 中 register 方法的代码修改如下：
//@RequestMapping("/register")
///**
// * 通过形参接收请求参数，形参名称与请求参数名称完全相同
// */
//public String register(String uname,String upass,Model model) {
//        if ("zhangsan".equals(uname)
//        && "123456".equals(upass)) {
//        logger.info("成功");
//        return "login"; // 注册成功，跳转到 login.jsp
//        } else {
//        logger.info("失败");
//        // 在register.jsp页面上可以使用EL表达式取出model的uname值
//        model.addAttribute("uname", uname);
//        return "register"; // 返回 register.jsp
//        }
//        }
//        通过 HttpServletRequest 接收请求参数
//        通过 HttpServletRequest 接收请求参数适用于 get 和 post 提交请求方式，可以将“通过实体 Bean 接收请求参数”部分中控制器类 UserController 中 register 方法的代码修改如下：
//@RequestMapping("/register")
///**
// * 通过HttpServletRequest接收请求参数
// */
//public String register(HttpServletRequest request,Model model) {
//        String uname = request.getParameter("uname");
//        String upass = request.getParameter("upass");
//        if ("zhangsan".equals(uname)
//        && "123456".equals(upass)) {
//        logger.info("成功");
//        return "login"; // 注册成功，跳转到 login.jsp
//        } else {
//        logger.info("失败");
//        // 在register.jsp页面上可以使用EL表达式取出model的uname值
//        model.addAttribute("uname", uname);
//        return "register"; // 返回 register.jsp
//        }
//        }
//        通过 @PathVariable 接收 URL 中的请求参数
//        通过 @PathVariable 获取 URL 中的参数，控制器类示例代码如下：
//@Controller
//@RequestMapping("/user")
//public class UserController {
//    @RequestMapping("/user")
//    // 必须节method属性
//    /**
//     * 通过@PathVariable获取URL的参数
//     */
//    public String register(@PathVariable String uname,@PathVariable String upass,Model model) {
//        if ("zhangsan".equals(uname)
//                && "123456".equals(upass)) {
//            logger.info("成功");
//            return "login"; // 注册成功，跳转到 login.jsp
//        } else {
//            // 在register.jsp页面上可以使用EL表达式取出model的uname值
//            model.addAttribute("uname", uname);
//            return "register"; // 返回 register.jsp
//        }
//    }
//}
//在访问“http://localhost：8080/springMVCDemo02/user/register/zhangsan/123456”路径时，上述代码自动将 URL 中的模板变量 {uname} 和 {upass} 绑定到通过 @PathVariable 注解的同名参数上，即 uname=zhangsan、upass=123456。
//        通过 @RequestParam 接收请求参数
//        通过 @RequestParam 接收请求参数适用于 get 和 post 提交请求方式，可以将“通过实体 Bean 接收请求参数”部分控制器类 UserController 中 register 方法的代码修改如下：
//@RequestMapping("/register")
///**
// * 通过@RequestParam接收请求参数
// */
//public String register(@RequestParam String uname,
//@RequestParam String upass, Model model) {
//        if ("zhangsan".equals(uname) && "123456".equals(upass)) {
//        logger.info("成功");
//        return "login"; // 注册成功，跳转到 login.jsp
//        } else {
//        // 在register.jsp页面上可以使用EL表达式取出model的uname值
//        model.addAttribute("uname", uname);
//        return "register"; // 返回 register.jsp
//        }
//        }
//        通过 @RequestParam 接收请求参数与“通过处理方法的形参接收请求参数”部分的区别如下：当请求参数与接收参数名不一致时，“通过处理方法的形参接收请求参数”不会报 404 错误，而“通过 @RequestParam 接收请求参数”会报 404 错误。
//        通过 @ModelAttribute 接收请求参数
//        当 @ModelAttribute 注解放在处理方法的形参上时，用于将多个请求参数封装到一个实体对象，从而简化数据绑定流程，而且自动暴露为模型数据，在视图页面展示时使用。
//
//        而“通过实体 Bean 接收请求参数”中只是将多个请求参数封装到一个实体对象，并不能暴露为模型数据（需要使用 model.addAttribute 语句才能暴露为模型数据，数据绑定与模型数据展示后面教程中会讲解）。
//
//        通过 @ModelAttribute 注解接收请求参数适用于 get 和 post 提交请求方式，可以将“通过实体 Bean 接收请求参数”中控制器类 UserController 中 register 方法的代码修改如下：
//        纯文本复制
//@RequestMapping("/register")
//public String register(@ModelAttribute("user") UserForm user) {
//        if ("zhangsan".equals(uname) && "123456".equals(upass)) {
//        logger.info("成功");
//        return "login"; // 注册成功，跳转到 login.jsp
//        } else {
//        logger.info("失败");
//        // 使用@ModelAttribute("user")与model.addAttribute("user",user)的功能相同
//        //register.jsp页面上可以使用EL表达式${user.uname}取出ModelAttribute的uname值
//        return "register"; // 返回 register.jsp
//        }
//        }
