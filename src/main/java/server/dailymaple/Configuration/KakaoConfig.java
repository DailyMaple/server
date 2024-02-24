package server.dailymaple.Configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KakaoConfig {
    @Bean
    public GroupedOpenApi getKakaoLoginApi() {
        return GroupedOpenApi.builder()
                .group("KakaoLogin")
                .pathsToMatch("/oauth/kakao")
                .pathsToExclude("")
                .packagesToScan("server.dailymaple.oauth.controller")
                .build();
    }
}
