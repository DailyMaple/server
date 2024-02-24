package server.dailymaple.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.constant.LoginType;
import server.dailymaple.dto.LoginRequest;
import server.dailymaple.dto.LoginResponse;
import server.dailymaple.service.OauthService;

@Tag(name = "SignUp", description = "SignUp Api")
@RestController
@AllArgsConstructor
@RequestMapping("/oauth")
public class OauthController{

    private final OauthService service;


    @Operation(summary = "Oauth 타입 별 로그인", description = "각 Oauth 타입에 맞는 로그인을 진행한 뒤 AccessToken을 반환한다.")
    @PostMapping("/login")
    public LoginResponse login(@RequestParam LoginType type, @RequestBody LoginRequest loginRequest) {
        return service.login(loginRequest, type);
    }
}
