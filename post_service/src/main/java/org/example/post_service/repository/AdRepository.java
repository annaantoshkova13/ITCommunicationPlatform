package org.example.post_service.repository;

import org.example.post_service.model.Ad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AdRepository extends CrudRepository<Ad, Long> {

    @Query("SELECT a FROM Ad a WHERE a.post.id = ?1")
    Optional<Ad> findByPostId(long postId);

    List<Ad> findAllByBuyerId(long buyerId);
}
