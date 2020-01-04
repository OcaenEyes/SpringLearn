package com.gzy.spring_basic_test.bean_action_scope_service_test;


/**
 * 在 Spring 中，Bean 的作用域决定了从 Spring 容器中返回的 Bean 实例的类型。在 Spring 中，支持以下 5 种类型的作用域：
 *
 * singleton — 单例模式，由 IOC 容器返回一个唯一的 bean 实例。
 * prototype — 原型模式，被请求时，每次返回一个新的 bean 实例。
 * request — 每个 HTTP Request 请求返回一个唯一的 Bean 实例。
 * session — 每个 HTTP Session 返回一个唯一的 Bean 实例。
 * globalSession — Http Session 全局 Bean 实例。
 * 注：大多数情况下，你可能只需要处理 Spring 的核心作用域 — 单例模式（ singleton ）和原型模式（ prototype ），默认情况下，作用域是单例模式。
 *
 */
public class  CustomerService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
