package com.gzy.spring_aop_test.advice;

import com.gzy.spring_aop_test.advice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAopBeans.xml");
        UserService userService = (UserService) context.getBean("userServiceProxy");

        System.out.println("------------");
        userService.printName();

        System.out.println("------------");
        userService.printUrl();

        try{
            userService.printThrowException();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
