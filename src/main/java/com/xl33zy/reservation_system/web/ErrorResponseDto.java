package com.xl33zy.reservation_system.web;

import java.time.LocalDateTime;

public record ErrorResponseDto(String message, String detailedMessage, LocalDateTime errorTime) {

}
