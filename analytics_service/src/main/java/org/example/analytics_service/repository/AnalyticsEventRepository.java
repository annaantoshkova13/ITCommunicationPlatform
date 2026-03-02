package org.example.analytics_service.repository;

import jdk.jfr.EventType;
import org.example.analytics_service.model.AnalyticsEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AnalyticsEventRepository extends CrudRepository<AnalyticsEvent, Long> {

    Stream<AnalyticsEvent> findByReceiverIdAndEventType(long receiverId, EventType eventType);
}
