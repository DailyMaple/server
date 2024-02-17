package server.dailymaple.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.dto.LoginResponseDto;
import server.dailymaple.service.LoginService;

@Tag(name = "Login", description = "Login Api")
@RestController
@AllArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    @Operation(summary = "로그인", description = "아아디와 비밀번호를 받아 로그인가능 여부를 판별한다")
    @PostMapping("")
    public Long login(@RequestBody LoginResponseDto loginResponseDto){
        return loginService.login(loginResponseDto);
    }
}
