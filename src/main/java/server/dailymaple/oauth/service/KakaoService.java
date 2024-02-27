package server.dailymaple.oauth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.dailymaple.constant.LoginType;
import server.dailymaple.entity.Member;
import server.dailymaple.oauth.kakao.client.KakaoAccessClient;
import server.dailymaple.oauth.kakao.constants.KakaoOauthConstant;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;
import server.dailymaple.oauth.service.dto.KakaoUserIdResponse;
import server.dailymaple.repository.MemberRepository;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class KakaoService {
    private final KakaoAccessClient client;
    private final MemberRepository repository;

    @Value("${spring.security.oauth2.client.registration.kakao.client_id}")
    private String CLIENT_ID;

    @Transactional
    public String login(KakaoTokenResponse req){
        String userId = String.valueOf(getUserId(req).id());
        return (repository.findByAccountId(userId)== null) ? signUp(req,userId) : userId;
    }

    @Transactional
    public String signUp(KakaoTokenResponse req, String userId){
        Member newMember = Member.builder()
                .accountId(userId)
                .password(null)
                .type(LoginType.KAKAO)
                .deleted(false)
                .build();
        return repository.save(newMember).getAccountId();
    }

    public KakaoTokenResponse getOauthToken(KakaoTokenRequest req){
        return client.getKakaoAuthorizationCode(KakaoOauthConstant.GRANT_TYPE,CLIENT_ID,KakaoOauthConstant.REDIRECT_URL,req.code());
    }

    public KakaoUserIdResponse getUserId(KakaoTokenResponse req){
        return client.getKakaoUserId("Bearer " + req.access_token());
    }

}
