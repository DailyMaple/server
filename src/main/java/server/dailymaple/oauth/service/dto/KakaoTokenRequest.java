package server.dailymaple.oauth.service.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
public record KakaoTokenRequest(
        String code
) {

}
