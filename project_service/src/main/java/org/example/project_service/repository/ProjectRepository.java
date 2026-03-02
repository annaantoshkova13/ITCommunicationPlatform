package org.example.project_service.repository;

import org.example.project_service.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query(
            "SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END " +
                    "FROM Project p " +
                    "WHERE p.ownerId = :ownerId AND p.name = :name"
    )
    boolean existsByOwnerIdAndName(Long ownerId, String name);
}
