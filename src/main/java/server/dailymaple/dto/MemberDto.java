package server.dailymaple.dto;

public record MemberDto(
        Long id,
        String accountId,
        String password,
        boolean deleted

) {
}
