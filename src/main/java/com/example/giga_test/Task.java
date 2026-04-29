package com.example.giga_test;

import java.time.LocalDateTime;

public class Task {
    private final int id;
    private final String title;
    private final String description;
    private final Status status;
    private final Priority priority;
    private final Category category;
    private final User user;
    private final Operator operator;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public Task(int id, String title, String description, Status status, Priority priority, Category category, User user, Operator operator, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.user = user;
        this.operator = operator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public Category getCategory() {
        return category;
    }

    public User getUser() {
        return user;
    }

    public Operator getOperator() {
        return operator;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
