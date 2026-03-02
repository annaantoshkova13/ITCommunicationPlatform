package org.example.user_service.repository;

import org.example.user_service.entity.ContentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentDataRepository extends JpaRepository<ContentData, Long> {
}
