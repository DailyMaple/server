package server.dailymaple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.dailymaple.dto.LoginResponseDto;
import server.dailymaple.entity.Member;
import server.dailymaple.repository.MemberRepository;
import server.dailymaple.utils.exception.BaseException;
import server.dailymaple.utils.exception.BaseExceptionCode;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Long login(LoginResponseDto loginResponseDto) {
        checkValidAccountId(loginResponseDto);
        return checkValidPassword(loginResponseDto);
    }

    public Long checkValidPassword(LoginResponseDto loginResponseDto){
        Member member = memberRepository.findByAccountId(loginResponseDto.accountId());
        if(!member.getPassword().equals(loginResponseDto.password())){
            throw new BaseException(BaseExceptionCode.INVALID_PASSWORD.getHttpStatus(),BaseExceptionCode.INVALID_PASSWORD.getMessage());
        };
        return member.getId();
    }

    public boolean checkValidAccountId(LoginResponseDto loginResponseDto) {
            if (!memberRepository.existsByAccountId(loginResponseDto.accountId())){
                throw new BaseException(BaseExceptionCode.INVALID_USER.getHttpStatus(),BaseExceptionCode.INVALID_USER.getMessage());
            }
            return true;
    }

}
