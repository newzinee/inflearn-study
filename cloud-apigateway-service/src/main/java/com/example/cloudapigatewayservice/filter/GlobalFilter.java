package com.example.cloudapigatewayservice.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GlobalFilter extends AbstractGatewayFilterFactory<GlobalFilter.Config> {

    public GlobalFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(final Config config) {
        // Global pre filter
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("Global filter baseMessage: {}", config.getBaseMessage());

            if (config.isPreLogger()) {
                log.info("Global Filter Start: {}, {}, {}, {}, {}, {}, {}", request.getId(), request.getMethod(),  request.getPath(), request.getURI(), request.getHeaders(), request.getBody(), request.getQueryParams());
            }

            // Global post filter
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                if (config.postLogger) {
                    log.info("Global Filter End: request id -> {}, response code -> {}, {}, {}, {}, {}, {}, {}, {}, {}", request.getId(), response.getStatusCode()
                            , request.getMethod(),  request.getPath(), request.getURI(), request.getHeaders(), request.getBody(), request.getQueryParams()
                            , response.getHeaders(), response.getCookies());
                }
            }));

        };
    }

    @Data
    public static class Config {

        private String baseMessage;

        private boolean preLogger;

        private boolean postLogger;

    }

}
