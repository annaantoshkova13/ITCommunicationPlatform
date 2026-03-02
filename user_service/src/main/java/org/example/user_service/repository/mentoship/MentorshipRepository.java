package org.example.user_service.repository.mentoship;

import org.example.user_service.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface MentorshipRepository extends CrudRepository<User, Long> {
}
