package com.gzy.spring_aop_test.advice_test;

public class UserService {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName(){
        System.out.println("用户名是："+this.name);
    }

    public void printUrl(){
        System.out.println("站点是："+this.url);
    }

    public void printThrowException(){
        throw new IllegalArgumentException();
    }
}
