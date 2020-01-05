package com.gzy.spring_aop_test.aspectj_test;

/**
 * 定义接口类
 */
public interface IPersonBo {
    void addPerson();
    void deletePerson();
    String AddPersonReturnValue();
    void addPersonThrowException() throws Exception;
    void addPersonAround(String name);
}
