package server.dailymaple.oauth.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Builder
@Schema(title = "code 전달용 DTO")
public record KakaoTokenRequest(
        String code
) {

}
