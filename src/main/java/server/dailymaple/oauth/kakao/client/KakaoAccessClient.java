package server.dailymaple.oauth.kakao.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import server.dailymaple.oauth.service.dto.KakaoAuthorizationResponse;

@HttpExchange("https://kauth.kakao.com")
public interface KakaoAccessClient {

    @GetExchange("/oauth/authorize")
    public KakaoAuthorizationResponse getKakaoAuthorizationCode(
            @RequestParam("client_id") String clientId,
            @RequestParam("redirect_uri") String redirectUrl,
            @RequestParam("response_type") String response_type
    );

    @GetMapping("/example.com/oauth")
    String kakaoCallback(@RequestParam String code);

}
