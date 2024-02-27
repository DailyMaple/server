package server.dailymaple.oauth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.oauth.service.KakaoService;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;


@Tag(name = "카카오 oauth", description = "카카오 oauth api")
@RestController
@RequiredArgsConstructor
@RequestMapping("/oauth/kakao")
public class KakaoController {

    private final KakaoService service;

    @Operation(summary = "Oauth 타입 별 로그인", description = "각 Oauth 타입에 맞는 로그인을 진행하고 카카오 oauthId를 반환한다.")
    @PostMapping("/login")
    public String login(@RequestBody KakaoTokenRequest req) {
        return service.login(req);
    }
}
