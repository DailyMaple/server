package server.dailymaple.oauth.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.dailymaple.oauth.service.KakaoService;
import server.dailymaple.oauth.service.dto.KakaoTokenRequest;
import server.dailymaple.oauth.service.dto.KakaoTokenResponse;

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
}
