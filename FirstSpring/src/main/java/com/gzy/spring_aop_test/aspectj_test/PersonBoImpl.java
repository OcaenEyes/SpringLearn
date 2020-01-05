package com.gzy.spring_aop_test.aspectj_test;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 实现IPersonBo接口类
 */
public class PersonBoImpl implements IPersonBo{

    public void addPerson() {
        System.out.println("addPerson()... 正在运行");
    }

    public void deletePerson() {
        System.out.println("deletePerson()...正在运行");
    }

    public String AddPersonReturnValue() {
        System.out.println("AddPersonReturnValue()...正在运行");
        return "gzy";
    }

    public void addPersonThrowException() throws Exception {
        System.out.println("addPersonThrowException()...正在运行");
        throw new Exception("示意一个错误");
    }

    public void addPersonAround(String name) {
        System.out.println("addPersonAround(String name)...正在运行, 参数是："+name);
    }
}
