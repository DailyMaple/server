package server.dailymaple.oauth.service.dto;


public record KakaoAuthorizationResponse(
        String code,
        String error,
        String error_description,
        String state
) {
}
