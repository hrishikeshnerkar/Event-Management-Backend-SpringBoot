package com.example.event_management.controller;

import com.example.event_management.model.Seat;
import com.example.event_management.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @PostMapping
    public ResponseEntity<Seat> reserveSeat(@RequestBody Seat seat) {
        return ResponseEntity.ok(seatRepository.save(seat));
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<Seat>> getSeatsForEvent(@PathVariable Long eventId) {
        return ResponseEntity.ok(seatRepository.findByEventId(eventId));
    }
}