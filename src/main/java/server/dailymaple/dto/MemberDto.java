package server.dailymaple.dto;

import lombok.Builder;
import server.dailymaple.constant.LoginType;

@Builder
public record MemberDto(
        Long id,
        String accountId,
        String password,

        LoginType type,
        boolean deleted

) {
}
