package server.dailymaple.oauth.kakao.client;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import server.dailymaple.oauth.kakao.constants.KakaoOauthUrl;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;
import server.dailymaple.oauth.service.dto.KakaoUserIdResponse;

@HttpExchange("")
public interface KakaoAccessClient {


    @PostExchange(KakaoOauthUrl.OAUTH_TOKEN_MAKE_URL)
    KakaoTokenResponse getKakaoAuthorizationCode(
            @RequestParam("grant_type") String grantType,
            @RequestParam("client_id") String clientId,
            @RequestParam("redirect_uri") String redirectUri,
            @RequestParam("code") String code
    );

    @GetExchange(KakaoOauthUrl.OAUTH_GET_USERINFO_URL)
    KakaoUserIdResponse getKakaoUserId(
            @RequestHeader String authorization
    );

}
