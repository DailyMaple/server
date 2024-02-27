package server.dailymaple.oauth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.oauth.service.KakaoService;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;
import server.dailymaple.oauth.service.dto.KakaoUserIdResponse;

import java.util.HashMap;

@Tag(name = "카카오 oauth", description = "카카오 oauth api")
@RestController
@RequiredArgsConstructor
@RequestMapping("/oauth/kakao")
public class KakaoController {

    private final KakaoService service;

    @PostMapping("")
    public KakaoTokenResponse getToken(KakaoTokenRequest req){
        return service.getOauthToken(req);
    }

    @PostMapping("/test")
    public KakaoUserIdResponse getUserId(@RequestBody KakaoTokenResponse req){
        return service.getUserId(req);
    }

    @Operation(summary = "Oauth 타입 별 로그인", description = "각 Oauth 타입에 맞는 로그인을 진행한 뒤 AccessToken을 반환한다.")
    @PostMapping("/login")
    public String login(@RequestBody KakaoTokenResponse req){
        return service.login(req);
    }
}
