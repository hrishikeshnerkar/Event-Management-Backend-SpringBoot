package com.example.event_management.service;

import com.example.event_management.model.Event;
import com.example.event_management.model.Seat;
import com.example.event_management.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getSeatsByEvent(Event event) {
        return seatRepository.findByEvent(event);
    }

    public Seat reserveSeat(Seat seat) {
        seat.setReserved(true);
        return seatRepository.save(seat);
    }
}