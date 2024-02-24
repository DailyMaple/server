package server.dailymaple.oauth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.dailymaple.oauth.kakao.client.KakaoAccessClient;
import server.dailymaple.oauth.service.dto.KakaoAuthorizationRequest;
import server.dailymaple.oauth.service.dto.KakaoAuthorizationResponse;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class KakaoService {
    private final KakaoAccessClient client;

    @Value("${spring.security.oauth2.client.registration.kakao.client_id}")
    private String CLIENT_ID;
    private final static String CODE = "code";
    private final static String REDIRECT_URL = "https://example.com/oauth";





//client.getKakaoAuthorizationCode(CLIENT_ID,REDIRECT_URL,CODE);

}
