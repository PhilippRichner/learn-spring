package com.baeldung.ls.web.controller;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProjectControllerIntegrationTest {
  
  @Test
  public void whenWebEnvIsInstantiated_thenOk() {
    
  }
}
