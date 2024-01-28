package server.dailymaple.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("")
    public Boolean checkIdExist(@RequestBody MemberDto memberDto){
        return loginService.checkIdExist(memberDto);
    }
}
