package com.example.micro.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class RoutesConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("work-info-route",
                        route -> route
                                .path("/")
                                .and()
                                .method(HttpMethod.GET)
                                .filters(filter -> filter.setPath("/api"))
                                .uri("lb://work-info"))
                .route("employee-route",
                        route -> route
                                .path("/employee/**")
                                .filters(filter -> filter.stripPrefix(1))
                                .uri("lb://employee-service"))
                .build();
    }
}
