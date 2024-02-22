package server.dailymaple.utils.kakao.service;

import lombok.AllArgsConstructor;
import server.dailymaple.constant.LoginType;
import server.dailymaple.dto.LoginRequest;
import server.dailymaple.dto.MemberDto;
import server.dailymaple.entity.Member;
import server.dailymaple.service.OauthProvider;
import server.dailymaple.service.SignUpService;
import server.dailymaple.utils.kakao.client.KakaoAccessClient;
import server.dailymaple.utils.kakao.dto.KakaoIdResponse;
import server.dailymaple.utils.kakao.dto.KakaoInfoResponse;

@AllArgsConstructor
public class  KakaoOauthProvider implements OauthProvider<KakaoIdResponse, KakaoInfoResponse> {
    private final KakaoAccessClient client;
    private final SignUpService service;

    @Override
    public KakaoIdResponse getUserId(LoginRequest loginRequest) {
        return client.getKakaoUserId("Bearer ${loginRequest.accessToken}");
    }

    @Override
    public KakaoInfoResponse getUserInfo(LoginRequest loginRequest) {
        return client.getKakaoUserInfo("Bearer ${loginRequest.accessToken}");
    }

    @Override
    public Long signUp(LoginRequest loginRequest) {
        KakaoInfoResponse savedInfo = getUserInfo(loginRequest);
        MemberDto newMember = MemberDto.builder()
                .accountId(savedInfo.id())
                .deleted(false)
                .type(LoginType.KAKAO)
                .build();
        return service.signUp(newMember);
    }
}
