package org.example.project_service.repository;

import org.example.project_service.model.Moment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MomentRepository extends JpaRepository<Moment, Long> {

    @Query(nativeQuery = true, value = """
    select m.* from moment m
    where m.id in
    (select moment_id from moment_project where project_id = :projectId)
    """)
    List<Moment> findAllByProjectId(long projectId);
}
