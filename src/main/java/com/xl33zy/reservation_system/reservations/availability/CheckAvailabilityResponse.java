package com.xl33zy.reservation_system.reservations.availability;

public record CheckAvailabilityResponse(
        String message,
        AvailabilityStatus status
) {
}
