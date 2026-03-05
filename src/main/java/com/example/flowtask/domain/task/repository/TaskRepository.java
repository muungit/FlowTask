package com.example.flowtask.domain.task.repository;

import com.example.flowtask.domain.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}