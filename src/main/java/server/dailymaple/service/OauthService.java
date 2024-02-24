package server.dailymaple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.dailymaple.constant.LoginType;
import server.dailymaple.dto.LoginRequest;
import server.dailymaple.dto.LoginResponse;
import server.dailymaple.entity.Member;
import server.dailymaple.repository.MemberRepository;
import server.dailymaple.utils.kakao.JwtTokenProvider;
import server.dailymaple.utils.kakao.dto.KakaoIdResponse;
import server.dailymaple.utils.kakao.service.KakaoOauthProvider;

@Service
@RequiredArgsConstructor
public class OauthService {

    private final JwtTokenProvider jwtTokenProvider;
    private final KakaoOauthProvider kakaoOauthProvider;
    private final MemberRepository memberRepository;

    public LoginResponse login(LoginRequest loginRequest, LoginType loginType){
        KakaoIdResponse kakaoIdDto = kakaoOauthProvider.getUserId(loginRequest);
        Long memberId = Long.valueOf(kakaoIdDto.id());

        if(memberId == null){
            memberId = signUp(loginRequest, loginType);
        }
        return new LoginResponse(jwtTokenProvider.createToken(String.valueOf(memberId)));
    }

    public Long signUp(LoginRequest loginRequest, LoginType loginType){
        Long memberId = kakaoOauthProvider.signUp(loginRequest, loginType);
        return memberId;
    }
}
