package server.dailymaple.Configuration;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginConfig {

    @Bean
    public GroupedOpenApi getLoginApi() {
        return GroupedOpenApi.builder()
                .group("Login")
                .pathsToMatch("/login/**")
                .pathsToExclude("")
                .packagesToScan("java.server.dailymaple.controller")
                .build();
    }
}
