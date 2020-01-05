package com.gzy.spring_transaction_test;

import com.gzy.spring_transaction_test.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext context;

    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("SpringTransactionBeans.xml");

        AccountService accountService = (AccountService) context.getBean("accountService");

        //tom 向 marry转账1000
        accountService.transfer("Tom","Marry",1000);
        System.out.println("转账成功");

    }
}
