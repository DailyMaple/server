package server.dailymaple.utils.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Builder
public record ErrorResponse(
        Integer status,
        String error,
        String message,
        String path
) {
    public ErrorResponse(HttpStatus status, String message, String path) {
        this(status.value(), status.name(), message, path);
    }
}
