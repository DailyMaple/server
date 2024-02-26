package server.dailymaple.oauth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.dailymaple.oauth.kakao.client.KakaoAccessClient;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class KakaoService {
    private final KakaoAccessClient client;

    @Value("${spring.security.oauth2.client.registration.kakao.client_id}")
    private String CLIENT_ID;
    private static final String GRANT_TYPE = "authorization_code";
    private static final String REDIRECT_URL = "https://example.com/oauth";
    private static final String Content_type = "application/x-www-form-urlencoded;charset=utf-8";


    public KakaoTokenResponse getOauthToken(KakaoTokenRequest req){
        return client.getKakaoAuthorizationCode(GRANT_TYPE,CLIENT_ID,REDIRECT_URL,req.code());
    }

}
