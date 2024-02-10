package server.dailymaple.dto;

import lombok.Builder;

@Builder
public record accountIdResponse(
        String accountId
){
}
