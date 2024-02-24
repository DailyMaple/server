package server.dailymaple.oauth.kakao.client;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class KakaoAccessProxyClient {
    @Bean
    public static KakaoAccessClient kakaoOpenApiClient() {
        WebClient webClient = WebClient.builder().build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
        return factory.createClient(KakaoAccessClient.class);
    }
}
