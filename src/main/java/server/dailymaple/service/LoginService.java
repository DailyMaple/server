package server.dailymaple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.dailymaple.dto.LoginResponseDto;
import server.dailymaple.repository.MemberRepository;
import server.dailymaple.utils.exception.BaseException;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Long login(LoginResponseDto loginResponseDto){
        if(checkValidLogin(loginResponseDto.accountId())){

        }


    }

    public boolean checkValidLogin(String accountId){
        try {
            return memberRepository.existsByAccountId(accountId);
        }catch (BaseException e){
            throw e;
        }
    }

}
