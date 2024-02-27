package server.dailymaple.oauth.service.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(title = "유저정보를 가져올때 id만 파싱하기 위해 사용하는 DTO")
public record KakaoUserIdResponse(
        Long id
) {
}
