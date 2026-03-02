package org.example.project_service.repository;

import org.example.project_service.model.stage.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Stage, Long> {
}
