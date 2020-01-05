package com.gzy.spring_aop_test.aspectj_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspectAdviceSeparatePointcut {
    @Before("com.gzy.spring_aop_test.aspectj_test.PointcutsDefinition.personLog()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore()... 正在运行");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("**************");
    }

    @After("com.gzy.spring_aop_test.aspectj_test.PointcutsDefinition.personLog()")
    public void loAfter(JoinPoint joinPoint){
        System.out.println("logAfter()...正在运行");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("***************");
    }
}
