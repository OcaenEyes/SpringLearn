package com.gzy.spring_basic_test;

import com.gzy.spring_basic_test.Config.SpringTestClient;
import com.gzy.spring_basic_test.Config.SpringTestConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static ApplicationContext context;
    public static void main(String[] args){
//        context = new ClassPathXmlApplicationContext(new String[] {"SpringOutput.xml"});
//        OutputHelper output = (OutputHelper) context.getBean("outputHelper");
//        output.generateOutpt();


//        context = new ClassPathXmlApplicationContext(new String[]{"SpringBeans.xml","UserBean.xml"});
//        Customer obj = (Customer) context.getBean("customer");
//        System.out.println(obj.toString());
//
//        CustomerService csSingle = (CustomerService) context.getBean("customerService");
//        csSingle.setMessage("单例模式消息");
//        System.out.println("消息:"+csSingle.getMessage());
//
//        CustomerService csPrototype = (CustomerService) context.getBean("customerService2");
//        System.out.println("消息:"+csPrototype.getMessage());
//
//
//        /**
//         * case1 : List 情况
//         */
//        com.gzy.spring_basic_test.bean_collections.Customer customer = (com.gzy.spring_basic_test.bean_collections.Customer) context.getBean("customerBean");
//        System.out.println(customer.getLists().toString());
//
//        //case2 Set情况
//        System.out.println(customer.getSets().toString());
//
//        // case3 Mapq情况
//        System.out.println(customer.getMaps().toString());
//
//        //case4 properties情况
//        System.out.println(customer.getPros().toString());
//
//        UserService userService = (UserService) context.getBean("userService");
//        System.out.println(userService);

//        context = new AnnotationConfigApplicationContext(AppConfig.class);
//        IUser obj = (IUser) context.getBean("user");
//        obj.sayHello();

        context = new AnnotationConfigApplicationContext(SpringTestConfig.class);
        SpringTestClient springTestClient = context.getBean("springTestClient",SpringTestClient.class);
        springTestClient.invokeService();
    }
}
