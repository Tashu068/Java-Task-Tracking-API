package com.example.tasktracker.repository;

import com.example.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
    // No need to implement any methods, Spring Data JPA provides them for us.
}
