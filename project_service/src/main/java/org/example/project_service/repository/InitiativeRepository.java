package org.example.project_service.repository;

import org.example.project_service.model.initiative.Initiative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitiativeRepository extends JpaRepository<Initiative, Long> {
}
