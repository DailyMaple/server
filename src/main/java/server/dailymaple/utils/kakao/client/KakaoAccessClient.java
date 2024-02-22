package server.dailymaple.utils.kakao.client;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import server.dailymaple.utils.kakao.constants.KakaoOauthConstants;
import server.dailymaple.utils.kakao.dto.KakaoIdResponse;
import server.dailymaple.utils.kakao.dto.KakaoInfoResponse;

@HttpExchange(KakaoOauthConstants.KAKAO_URL)
public interface KakaoAccessClient {
    @PostExchange(KakaoOauthConstants.KAKAO_USER_INFO)
    public KakaoIdResponse getKakaoUserId(
            @RequestHeader("Authorization") String authorization
    );

    @PostExchange(KakaoOauthConstants.KAKAO_USER_INFO)
    public KakaoInfoResponse getKakaoUserInfo(
            @RequestHeader("Authorization") String authorization
    );
}



