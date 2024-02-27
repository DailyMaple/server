package server.dailymaple.oauth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.dailymaple.oauth.kakao.client.KakaoAccessClient;
import server.dailymaple.oauth.kakao.constants.KakaoOauthConstant;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;
import server.dailymaple.oauth.service.dto.KakaoUserIdResponse;

import java.util.HashMap;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class KakaoService {
    private final KakaoAccessClient client;

    @Value("${spring.security.oauth2.client.registration.kakao.client_id}")
    private String CLIENT_ID;


    public KakaoTokenResponse getOauthToken(KakaoTokenRequest req){
        return client.getKakaoAuthorizationCode(KakaoOauthConstant.GRANT_TYPE,CLIENT_ID,KakaoOauthConstant.REDIRECT_URL,req.code());
    }

    public KakaoUserIdResponse getUserId(KakaoTokenResponse req){
        return client.getKakaoUserId("Bearer " + req.access_token());
    }

}
