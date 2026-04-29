package com.example.giga_test;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {
    public Task getTaskByID(
            int id
    ) {
        return new Task(
                id,
                "Test",
                "testtest",
                Status.NEW,
                Priority.MEDIUM,
                Category.GENERAL,
                new User(1, "Demo User"),
                new Operator(100, "Demo Operator"),
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(8)

        );
    }
}
