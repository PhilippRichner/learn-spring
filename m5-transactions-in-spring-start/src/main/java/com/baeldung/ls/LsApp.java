package com.baeldung.ls;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.ls.service.IProjectService;
import com.baeldung.ls.service.ITaskService;

@SpringBootApplication
public class LsApp {

 

  private static final Logger log = LoggerFactory.getLogger(LsApp.class);

  @Autowired
  IProjectService             projectService;

  @Autowired
  ITaskService                taskService;

  @PostConstruct
  public void postConstruct() {
    try {
      projectService.createProjectWithTask();
    } catch (Exception e) {
      log.error("Error occured in creating project with tasks", e);
    }

    log.info("Fetching all projects");
    projectService.findAll().forEach(p -> log.info(p.toString()));

    log.info("Fetching all tasks");
    taskService.findAll().forEach(t -> log.info(t.toString()));

  }
  
  public static void main(final String... args) {
    SpringApplication.run(LsApp.class, args);
  }

}
