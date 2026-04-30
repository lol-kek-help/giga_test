package com.example.giga_test;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final Map<Long, Task> taskMap;
    private final AtomicLong idCounter;

    public TaskService() {
        taskMap = new HashMap<>();
        idCounter = new AtomicLong();
    }

    public List<Task> findAllTask() {
        return taskMap.values().stream().toList();
    }

    public Task getTaskByID(
            Long id
    ) {
        if (!taskMap.containsKey(id)){
            throw new NoSuchElementException("No that id = " + id);
        }
        return taskMap.get(id);
    }

    public Task createTask(Task taskToCreate) {
        Task newTask = taskToCreate.toBuilder()
                .id(idCounter.incrementAndGet())
                .build();
        taskMap.put(newTask.getId(), newTask);
        return newTask;
    }
}
