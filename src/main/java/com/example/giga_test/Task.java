package com.example.giga_test;

import java.time.LocalDateTime;


public class Task {
    int id;
    String title;
    String descriprion;
    Status status;
    Priority priority;
    Category category;
    User user;
    Operator operator;
    LocalDateTime created_at;
    LocalDateTime updated_at;

    public Task(int id, String title, String descriprion, Status status, Priority priority, Category category, User user, Operator operator, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.title = title;
        this.descriprion = descriprion;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.user = user;
        this.operator = operator;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriprion() {
        return descriprion;
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

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }
}
