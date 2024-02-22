package server.dailymaple.utils.kakao.client;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class KakaoAccessClientConfig {
    @Bean
    public KakaoAccessClient kakaoOpenApiClient(){
        WebClient webClient = WebClient.builder().build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
        return factory.createClient(KakaoAccessClient.class);
    }

}
