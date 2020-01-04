package com.gzy.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取User实例
        User user = acx.getBean("user", User.class);
        //调用方法
        System.out.println(user.toString());

    }
}
