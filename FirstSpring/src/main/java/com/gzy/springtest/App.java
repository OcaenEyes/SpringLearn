package com.gzy.springtest;

import com.gzy.springtest.innerbean_test01.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext context;
    public static void main(String[] args){
//        context = new ClassPathXmlApplicationContext(new String[] {"SpringOutput.xml"});
//        OutputHelper output = (OutputHelper) context.getBean("outputHelper");
//        output.generateOutpt();

//        context = new AnnotationConfigApplicationContext(AppConfig.class);
//        IUser obj = (IUser) context.getBean("user");
//        obj.sayHello();

        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Customer obj = (Customer) context.getBean("customer");
        System.out.println(obj.toString());



    }
}
