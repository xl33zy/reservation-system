package com.xl33zy.reservation_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        System.out.println("log called method");
        return reservationService.getReservationById(id);
    }

    @GetMapping()
    public List<Reservation> getAllReservations() {
        System.out.println("log called method");
        return reservationService.getAllReservations();
    }
}
