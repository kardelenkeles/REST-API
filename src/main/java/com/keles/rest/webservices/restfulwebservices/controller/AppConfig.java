package com.keles.rest.webservices.restfulwebservices.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
    @Bean
    public ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("message");
        source.setDefaultEncoding("UTF-8");
        source.setUseCodeAsDefaultMessage(true);

        return source;
    }
}
