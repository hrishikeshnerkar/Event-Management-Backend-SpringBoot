package com.example.event_management.repository;

import com.example.event_management.model.Event;
import com.example.event_management.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByEvent(Event event);

    List<Seat> findByEventId(Long eventId);
}