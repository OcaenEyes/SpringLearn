package com.gzy.spring_basic_test.java_config_test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 通过使用注释 @Configuration 告诉 Spring ，该 Class 是 Spring 的核心配置文件，
 * 并且通过使用注解 @Bean 定义 bean
 */
@Configuration
public class AppConfig {

    @Bean(name = "user")
    public IUser getUser(){
        return new User();
    }
}
/**
 * 通过上面的 @Configuration 注解，
 * 相当于在 ApplicationContext.xml 文件中添加如下配置，
 * 使用了 @Configuration+@Bean 就不需要添加了：
 */
