package server.dailymaple.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.dto.AccountIdResponse;
import server.dailymaple.dto.MemberDto;
import server.dailymaple.service.SignUpService;

@Tag(name = "SignUp", description = "SignUp Api")
@RestController
@AllArgsConstructor
@RequestMapping("/signup")
public class SignUpController {
    private final SignUpService loginService;

    @Operation(summary = "회원가입", description = "아아디와 비밀번호를 json타입으로 담아서 전달받으면 회원가입이 된다.")
    @PostMapping("")
    public Long signUp(@RequestBody MemberDto memberDto){
        return loginService.signUp(memberDto);
    }

    @Operation(summary = "아이디 중복확인", description = "중복여부에 따라 Boolean타입으로 반환한다.")
    @GetMapping("/{accountId}")
    public Boolean checkIdExist(@PathVariable String accountId){
        return loginService.checkIdExist(accountId);
    }

}
