package server.dailymaple.utils.kakao.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "카카오 토큰을 이용해, 카카오 oauth 서버에서 반환받는 정보들을 담은 dto")
public record KakaoInfoResponse(
        String id,
        String connected_at,
        KakaoAccount kakaoAccount
){

}