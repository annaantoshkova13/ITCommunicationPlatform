package org.example.project_service.repository;

import org.example.project_service.model.TeamMember;
import org.example.project_service.model.stage.Stage;
import org.example.project_service.model.stage_invitation.StageInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StageInvitationRepository extends JpaRepository<StageInvitation, Long>, JpaSpecificationExecutor<StageInvitation> {

    boolean existsByAuthorAndInvitedAndStage(TeamMember author, TeamMember invited, Stage stage);

    boolean existsByInvitedAndStage(TeamMember invited, Stage stage);
}
