package com.gzy.spring_aop_test.aspectj_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 简单的 AspectJ ，Advice 和 Pointcut 结合在一起
 * 必须使用 @Aspect 在 LoggingAspectAdviceAddPointcut 声明之前注释，以便被框架扫描到；
 * 此例 Advice 和 Pointcut 结合在一起，
 * 类中的具体方法 logBefore 和 logAfter 即为 Advice ，是要注入的代码，
 * Advice 方法上的表达式为 Pointcut 表达式
 */

@Aspect
public class LoggingAspectAdviceAddPointcut {
    @Before("execution(public * com.gzy.spring_aop_test.aspectj_test.PersonBoImpl.addPerson(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore()... 正在运行");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("**************");
    }

    @After("execution(public * com.gzy.spring_aop_test.aspectj_test.PersonBoImpl.deletePerson())")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("logAfter()...正在运行");
        System.out.println("hijacked:" + joinPoint.getSignature().getName());
        System.out.println("***************");
    }
}
