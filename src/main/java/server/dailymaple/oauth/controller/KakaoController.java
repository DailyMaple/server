package server.dailymaple.oauth.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.UriComponentsBuilder;
import server.dailymaple.oauth.service.KakaoService;
import server.dailymaple.oauth.service.dto.KakaoAuthorizationRequest;
import server.dailymaple.oauth.service.dto.KakaoAuthorizationResponse;

@Tag(name = "카카오 oauth", description = "카카오 oauth api")
@RestController
@AllArgsConstructor
@RequestMapping("/oauth/kakao")
public class KakaoController {

    private final KakaoService service;

}