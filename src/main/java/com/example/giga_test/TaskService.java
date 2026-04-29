package com.example.giga_test;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
public class TaskService {
    private final Map<Integer, Task> taskMap = Map.of(
            1, new Task(
                    1,
                    "Test",
                    "testtest",
                    Status.NEW,
                    Priority.MEDIUM,
                    Category.GENERAL,
                    new User(1, "Demo User"),
                    new Operator(100, "Demo Operator"),
                    LocalDateTime.now(),
                    LocalDateTime.now().plusHours(8)
            ),
            2, new Task(
                    2,
                    "Test",
                    "testtest",
                    Status.NEW,
                    Priority.MEDIUM,
                    Category.GENERAL,
                    new User(1, "Demo User"),
                    new Operator(100, "Demo Operator"),
                    LocalDateTime.now(),
                    LocalDateTime.now().plusHours(8)
            ),
            3, new Task(
                    3,
                    "Test",
                    "testtest",
                    Status.NEW,
                    Priority.MEDIUM,
                    Category.GENERAL,
                    new User(1, "Demo User"),
                    new Operator(100, "Demo Operator"),
                    LocalDateTime.now(),
                    LocalDateTime.now().plusHours(8))
    );

    public List<Task> findAllTask() {
        return taskMap.values().stream().toList();
    }

    public Task getTaskByID(
            int id
    ) {
        if (!taskMap.containsKey(id)){
            throw new NoSuchElementException("No that id = " + id);
        }
        return taskMap.get(id);
    }
}
