package com.baeldung.ls;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.baeldung.ls.persistence.repository.IProjectRepository;
import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class LsAppConfig {

//    @Bean
//    @Scope("singleton")         // This is optional / default value
//    public IProjectRepository singletonBean() {
//        return new ProjectRepositoryImpl();
//    }
    
    @Bean
    @Scope("prototype")
    public IProjectRepository prototypeBean() {
        return new ProjectRepositoryImpl();
    }
    
    
}