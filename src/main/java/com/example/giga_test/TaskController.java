package com.example.giga_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private static final Logger log = LoggerFactory.getLogger(TaskController.class);
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Task> getTaskByID(
            @PathVariable("id") Long id
    ) {
        log.info("called getTaskByID " + id);
        return ResponseEntity.ok(taskService.getTaskByID(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Task>> getAllTask() {
        log.info("called getAllTask");
        return ResponseEntity.ok(taskService.findAllTask());
    }
    @PostMapping()
    public ResponseEntity<Task> createTask (
            @RequestBody Task taskToCreate
    ){
        log.info("new Task");
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(taskService.createTask(taskToCreate));
    }
}
