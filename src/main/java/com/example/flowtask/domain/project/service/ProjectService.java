package com.example.flowtask.domain.project.service;

import com.example.flowtask.domain.project.dto.ProjectCreateRequest;
import com.example.flowtask.domain.project.entity.Project;
import com.example.flowtask.domain.project.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public Long create(ProjectCreateRequest req) {
        Project saved = projectRepository.save(Project.builder().name(req.name()).build());
        return saved.getId();
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }
}
