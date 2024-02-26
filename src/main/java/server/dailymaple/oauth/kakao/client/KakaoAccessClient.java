package server.dailymaple.oauth.kakao.client;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;

@HttpExchange("https://kauth.kakao.com")
public interface KakaoAccessClient {

    @PostExchange(contentType = "application/x-www-form-urlencoded",url = "/oauth/token")
    KakaoTokenResponse getKakaoAuthorizationCode(
            @RequestParam("grant_type") String grantType,
            @RequestParam("client_id") String clientId,
            @RequestParam("redirect_uri") String redirectUri,
            @RequestParam("code") String code
    );
}
