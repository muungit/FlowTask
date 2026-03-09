package com.example.flowtask.domain.project.dto;

import jakarta.validation.constraints.NotBlank;

public record ProjectCreateRequest(@NotBlank String name) {}
