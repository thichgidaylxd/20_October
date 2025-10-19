package com.example.demo    ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Cho phép tất cả origins
        config.addAllowedOriginPattern("*");

        // Cho phép tất cả headers
        config.addAllowedHeader("*");

        // Cho phép tất cả methods (GET, POST, PUT, DELETE, etc.)
        config.addAllowedMethod("*");

        // Cho phép credentials (cookies, authorization headers)
        config.setAllowCredentials(true);

        // Áp dụng cho tất cả các endpoint
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}