package com.gzy.springtest.innerbean_test01;

public class Customer {
    private Person person;

    //默认的不带参构造方法
    public Customer() {
        super();
    }

    //有带参的构造方法，此时一定要有默认构造方法
    public Customer(Person person){
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person +
                '}';
    }
}
