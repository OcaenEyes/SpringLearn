package com.gzy.spring_basic_test.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTestConfig {

    @Bean
    public SpringTestService springTestService(){
        return new SpringTestService();
    }

    @Bean
    public SpringTestClient springTestClient(){
        return new SpringTestClient();
    }

}
