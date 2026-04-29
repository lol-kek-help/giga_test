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
                new Priority(),
                new Category(),
                new User(),
                new Operator(),
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(8)

        );
    }
}
