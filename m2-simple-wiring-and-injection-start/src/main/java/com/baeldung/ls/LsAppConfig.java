package com.baeldung.ls;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LsAppConfig {
    
    @Bean
    public BeanA beanA() {
        return new BeanA();
    }
    
}
