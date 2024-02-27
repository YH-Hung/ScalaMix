package hle.scalamix.config;

import hle.scalamix.sc.ApiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> sampleRoute(ApiHandler apiHandler) {
        return route()
                .POST("/dao", apiHandler::getByIdSample)
                .build();
    }
}
