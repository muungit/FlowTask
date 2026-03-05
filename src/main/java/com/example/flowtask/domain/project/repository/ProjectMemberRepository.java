package com.example.flowtask.domain.project.repository;

import com.example.flowtask.domain.project.entity.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long> {
}
