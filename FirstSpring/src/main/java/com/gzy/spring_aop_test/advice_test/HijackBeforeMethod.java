package com.gzy.spring_aop_test.advice_test;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBeforeMethod implements MethodBeforeAdvice {
    public void before(Method arg0, Object[] args, Object target){
        System.out.println("gijackBeforeMethod: Before method hijacked");
    }
}
