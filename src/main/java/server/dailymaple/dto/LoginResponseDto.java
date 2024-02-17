package server.dailymaple.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Schema(title = "로그인시 전달용 DTO")
@Builder
public record LoginResponseDto(
        String accountId,
        String password
) {
}
