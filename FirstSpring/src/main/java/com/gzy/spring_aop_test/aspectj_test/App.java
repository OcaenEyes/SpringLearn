package com.gzy.spring_aop_test.aspectj_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"SpringAopAspectj.xml"});
        IPersonBo personBo = (IPersonBo) context.getBean("personBo");
        personBo.addPerson();

        System.out.println("-----------------------");

        personBo.deletePerson();



    }
}
