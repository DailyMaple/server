package server.dailymaple.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Schema(title = "accountId 전달용 DTO")
@Builder
public record AccountIdResponse(
        String accountId
){
}
