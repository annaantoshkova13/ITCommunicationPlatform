package org.example.project_service.repository;

import org.example.project_service.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
    @Query(
            "SELECT tm FROM TeamMember tm JOIN tm.team t " +
                    "WHERE tm.userId = :userId " +
                    "AND t.project.id = :projectId"
    )
    TeamMember findByUserIdAndProjectId(long userId, long projectId);

    List<TeamMember> findByUserId(long userId);
}
