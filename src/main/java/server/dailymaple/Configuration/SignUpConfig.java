package server.dailymaple.Configuration;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SignUpConfig {

    @Bean
    public GroupedOpenApi getLoginApi() {
        return GroupedOpenApi.builder()
                .group("SignUp")
                .pathsToMatch("/signup/**")
                .pathsToExclude("")
                .packagesToScan("server.dailymaple.controller")
                .build();
    }
}
