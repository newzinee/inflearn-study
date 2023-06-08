package com.example.clouduserservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.IpAddressMatcher;

import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurity {

    private final Environment env;

    private final List<IpAddressMatcher> ipWhiteList = List.of(
            new IpAddressMatcher("192.168.75.138")
            , new IpAddressMatcher("127.0.0.1")
    );

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")
                                , AntPathRequestMatcher.antMatcher("/users/**")
                                , AntPathRequestMatcher.antMatcher("/welcome")
                                , AntPathRequestMatcher.antMatcher("/health_check")
                                , AntPathRequestMatcher.antMatcher("/user-service/**")
                                , AntPathRequestMatcher.antMatcher("/actuator/**")
                        )
                        .access((authentication, context) -> new AuthorizationDecision(
                                ipWhiteList.stream().anyMatch(ip -> ip.matches(context.getRequest().getRemoteHost()))))
                )
                .addFilter(getAuthenticationFilter(authenticationManager(http.getSharedObject(AuthenticationConfiguration.class))))
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    private AuthenticationFilter getAuthenticationFilter(AuthenticationManager authenticationManager) {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(env);
        authenticationFilter.setAuthenticationManager(authenticationManager);
        return authenticationFilter;
    }

}
