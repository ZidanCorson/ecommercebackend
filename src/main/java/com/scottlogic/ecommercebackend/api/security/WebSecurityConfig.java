package com.scottlogic.ecommercebackend.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFilter;


@Configuration
public class WebSecurityConfig {

    private JWTRequestFilter jwtRequestFilter;

    public WebSecurityConfig(JWTRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .addFilterBefore(jwtRequestFilter, AuthenticationFilter.class)
                .authorizeHttpRequests(auth -> auth.requestMatchers("/product", "/auth/register", "/auth/login", "/auth/verify", "/auth/forgot","/auth/reset", "/error").permitAll()
                        .anyRequest().authenticated());
        return http.build();
    }
}
