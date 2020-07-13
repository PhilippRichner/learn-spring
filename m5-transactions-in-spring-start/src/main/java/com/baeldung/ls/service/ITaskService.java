package com.baeldung.ls.service;

import com.baeldung.ls.persistence.model.Task;
import com.baeldung.ls.service.impl.TaskNotSavedException;

public interface ITaskService {

    Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;
}
