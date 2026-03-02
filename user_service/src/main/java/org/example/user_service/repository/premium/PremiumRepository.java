package org.example.user_service.repository.premium;

import org.example.user_service.entity.premium.Premium;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PremiumRepository extends CrudRepository<Premium, Long> {

    boolean existsByUserId(long userId);

    List<Premium> findAllByEndDateBefore(LocalDateTime endDate);
}

