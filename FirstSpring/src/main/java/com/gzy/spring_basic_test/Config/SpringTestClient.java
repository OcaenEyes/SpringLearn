package com.gzy.spring_basic_test.Config;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringTestClient {
    @Autowired
    SpringTestService springTestService ;
    public void invokeService(){
        System.out.println("client invoke:"+ springTestService.sayHello());
    }
}
