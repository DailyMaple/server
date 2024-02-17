package server.dailymaple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.dailymaple.dto.AccountIdResponse;
import server.dailymaple.dto.MemberDto;
import server.dailymaple.entity.Member;
import server.dailymaple.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class SignUpService {
    private final MemberRepository memberRepository;

    public Long signUp(MemberDto memberDto){
        //ToDo 페스워드 암호화
        Member member = Member.createMember(memberDto.accountId(),memberDto.password());
        memberRepository.save(member);
        return member.getId();
    }

    public boolean checkIdExist(String accountId){
        return memberRepository.existsByAccountId(accountId);
    }
}
