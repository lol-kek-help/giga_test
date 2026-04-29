package com.example.giga_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"/tasks/{id:\\d+}", "/{id:\\d+}"})
    public Task getTaskByID(
            @PathVariable("id") int id
    ) {
        return taskService.getTaskByID(id);
    }
}
