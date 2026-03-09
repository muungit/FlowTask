package com.example.flowtask.domain.project.controller;

import com.example.flowtask.domain.project.dto.ProjectCreateRequest;
import com.example.flowtask.domain.project.entity.Project;
import com.example.flowtask.domain.project.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping
    public Long create(@Valid @RequestBody ProjectCreateRequest req) {
        return projectService.create(req);
    }

    @GetMapping
    public List<Project> list() {
        return projectService.findAll();
    }
}