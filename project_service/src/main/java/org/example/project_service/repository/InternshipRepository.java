package org.example.project_service.repository;

import org.example.project_service.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepository extends JpaRepository<Internship, Long> {
}
