package com.yedam.board_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(@NonNull CorsRegistry corsRegistry) {
        corsRegistry
            .addMapping("/**")
            .allowedMethods("*")
            .allowedOrigins("*");
    }
}
