package server.dailymaple.utils.kakao.dto;


public record KakaoAuthorizationCode(
        String code,
        String error,
        String error_description,
        String state
) {
}
