package server.dailymaple.utils.kakao.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Schema(title = "카카오 토큰에서 id값 만을 받아오기 위한 dto")
public record KakaoIdResponse(
        @Schema(title = "유저 id", example = "")
        String id
) {

}
