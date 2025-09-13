package com.xl33zy.reservation_system;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationService {
    public Reservation getReservationById(Long id) {
        return new Reservation(
                id,
                100L,
                40L,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                ReservationStatus.APPROVED
        );
    }

    public List<Reservation> getAllReservations() {

        return List.of(
                new Reservation(
                        1L,
                        100L,
                        40L,
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        ReservationStatus.APPROVED
                ),
                new Reservation(
                        2L,
                        100L,
                        40L,
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        ReservationStatus.APPROVED
                )
        );
    }
}
