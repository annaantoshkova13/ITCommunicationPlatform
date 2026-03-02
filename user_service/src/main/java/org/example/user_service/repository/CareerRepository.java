package org.example.user_service.repository;

import org.example.user_service.entity.Career;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerRepository extends JpaRepository<Career, Long> {

}