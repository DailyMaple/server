package server.dailymaple.oauth.service.dto;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;

@Builder
public record KakaoAuthorizationRequest(
//        @Value("${spring.security.oauth2.client.registration.kakao.client_id}")
//        String clientId,
        String redirectUrl
//        String response_type
) {

}
