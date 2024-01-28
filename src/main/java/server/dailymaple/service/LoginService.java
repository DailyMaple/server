package server.dailymaple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.dailymaple.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Long signUp(String accountId, String password){

    }

    public void validId(String accountId){

    }
}
