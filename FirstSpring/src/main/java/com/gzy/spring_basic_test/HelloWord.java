package com.gzy.spring_basic_test;

public class HelloWord {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("你好"+name);
    }
}
