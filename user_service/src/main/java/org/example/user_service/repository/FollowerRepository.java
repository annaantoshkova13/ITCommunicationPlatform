package org.example.user_service.repository;

import org.example.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<User, Long> {
}