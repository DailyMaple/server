package server.dailymaple.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.dailymaple.dto.MemberDto;
import server.dailymaple.service.LoginService;

@RestController
@AllArgsConstructor
@RequestMapping("/signup")
public class SignUpController {
    private final LoginService loginService;

    @PostMapping("")
    public Long signUp(@RequestBody MemberDto memberDto){
        return loginService.signUp(memberDto);
    }
}
