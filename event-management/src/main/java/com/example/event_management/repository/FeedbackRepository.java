package com.example.event_management.repository;


import com.example.event_management.model.Event;
import com.example.event_management.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByEvent(Event event);

    List<Feedback> findByEventId(Long eventId);
}