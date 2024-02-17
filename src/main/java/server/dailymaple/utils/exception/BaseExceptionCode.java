package server.dailymaple.utils.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum BaseExceptionCode {

    INVALID_USER(HttpStatus.UNAUTHORIZED, "인증되지 않은 사용자입니다."),

    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED,"비밀번호가 일치하지 않습니다"),


    INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    AUTHORIZATION_HEADER_NULL(HttpStatus.BAD_REQUEST, "인증 헤더가 null입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러입니다.");
    private final String message;
    private final HttpStatus httpStatus;


    BaseExceptionCode(HttpStatus httpCode, String message) {
        this.httpStatus = httpCode;
        this.message = message;
    }
}

