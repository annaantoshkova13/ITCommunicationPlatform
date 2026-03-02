package org.example.project_service.repository;

import org.example.project_service.model.Meet;
import org.example.project_service.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MeetRepository extends JpaRepository<Meet, Long> {

    Optional<Meet> findByProject(Project project);

    Optional<Meet> findByCreatorId(long creatorId);
}
