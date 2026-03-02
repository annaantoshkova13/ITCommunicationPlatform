package org.example.user_service.repository;

import org.example.user_service.entity.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Long> {

}
