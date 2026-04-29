package com.example.giga_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"/{id}"})
    public Task getTaskByID(
            @PathVariable("id") int id
    ) {
        System.out.println("get id");
        return taskService.getTaskByID(id);
    }

    @GetMapping("/")
    public List<Task> getAllTask() {
        System.out.println("get all");
        return taskService.findAllTask();
    }
}
