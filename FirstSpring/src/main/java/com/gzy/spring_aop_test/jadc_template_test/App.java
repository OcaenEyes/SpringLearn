package com.gzy.spring_aop_test.jadc_template_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    private static ApplicationContext context;

    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("SpringJdbcTemplateBeans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql = "INSERT INTO student VALUES(?,?,?)";
        int count = jdbcTemplate.update(sql, new Object[]{2, "gaozhiyong", 25});
        System.out.println(count);
    }
}
