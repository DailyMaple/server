package server.dailymaple.oauth.service.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(title = "카카오에서 발급한 엑세스 토큰 전달용 DTO")
public record KakaoTokenResponse(

        String access_token
) {
}
