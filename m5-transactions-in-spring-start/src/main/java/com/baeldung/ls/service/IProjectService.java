package com.baeldung.ls.service;

import java.util.Optional;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.service.impl.TaskNotSavedException;

public interface IProjectService {
    Iterable<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);
    
    void createProjectWithTask() throws TaskNotSavedException;
    
    
}
