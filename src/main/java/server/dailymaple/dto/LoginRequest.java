package server.dailymaple.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

@Schema(title = "oauth에서 발급 한 accessToken")
public record LoginRequest(
        @Schema(title = "액세스 토큰")
        @NotEmpty
        String accessToken
) {
}
