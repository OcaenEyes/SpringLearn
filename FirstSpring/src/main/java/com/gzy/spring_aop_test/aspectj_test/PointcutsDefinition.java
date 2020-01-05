package com.gzy.spring_aop_test.aspectj_test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutsDefinition {
    @Pointcut("execution( * com.gzy.spring_aop_test.aspectj_test.PersonBoImpl.*(..))")
    public void personLog(){

    }
}
