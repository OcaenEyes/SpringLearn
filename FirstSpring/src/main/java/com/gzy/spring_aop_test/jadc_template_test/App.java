package com.gzy.spring_aop_test.jadc_template_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    private static ApplicationContext context;

    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("SpringJdbcTemplateBeans.xml");
        System.out.println("读取到配置文件了");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        System.out.println("创建好数据库连接了");
        String sql = "INSERT INTO student VALUES(?,?,?)";
        System.out.println("SQL 写好了");
        System.out.println(sql);
        int count = jdbcTemplate.update(sql, new Object[] {2, "gaozhiyong", 25});
        System.out.println(count);
    }
}
