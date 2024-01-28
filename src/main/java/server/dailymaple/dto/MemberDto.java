package server.dailymaple.dto;

import lombok.Builder;

@Builder
public record MemberDto(
        Long id,
        String accountId,
        String password,
        boolean deleted

) {
}
