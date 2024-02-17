package server.dailymaple.utils.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> handleBaseException(BaseException exception, HttpServletRequest request) {
        String errorMessage = getErrorMessage(exception);
        String errorLocation = getErrorLocation(exception);

        log.warn("BaseException occurred: "+errorMessage , "Location: " +errorLocation);
        return createErrorResponse(exception.getHttpStatus(),errorMessage,request);
    }

    private String getErrorMessage(Exception exception) {
        return exception.getMessage() != null ? exception.getMessage() : "UNKNOWN_ERROR";
    }

    private String getErrorLocation(Exception exception) {
        return exception.getStackTrace()[0] != null ? exception.getStackTrace()[0].toString() : null;
    }

    private ResponseEntity<ErrorResponse> createErrorResponse(
            HttpStatus httpStatus,
            String errorMessage,
            HttpServletRequest request
    ) {
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, errorMessage, request.getRequestURI());
        return ResponseEntity.badRequest().body(errorResponse);
    }
}

