package com.example.cloudapigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

//@Configuration
public class FilterConfig {

//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/first-service/**")
                        .filters(f -> f.addRequestHeader("first-request-header", "first-request-header-value")
                                .addResponseHeader("first-response-header", "first-response-header-value"))
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request-header", "second-request-header-value")
                                .addResponseHeader("second-response-header", "second-response-header-value"))
                        .uri("http://localhost:8082"))
                .build();
    }

}
