package com.example.flowtask.domain.project.repository;

import com.example.flowtask.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
