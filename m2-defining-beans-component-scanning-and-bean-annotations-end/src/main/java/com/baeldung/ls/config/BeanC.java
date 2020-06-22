package com.baeldung.ls.config;

import javax.annotation.PreDestroy;

public class BeanC {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BeanC.class);
    
    @PreDestroy
    public void preDestroy() {
        log.info("@PreDestroy annotated method is called.");
    }

    public void destroy() {
        log.info("Custom destroy method is called.");
    }
    
}
