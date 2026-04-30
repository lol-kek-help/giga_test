package com.example.giga_test;

import lombok.*;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    Long id;
    String taskNumber;
    String title;
    String descriprion;
    Status status;
    Priority priority;
    Category category;
    User requester;
    User assignedTo;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    LocalDateTime resolutionDeadline;
    String resolutionComment;
}
