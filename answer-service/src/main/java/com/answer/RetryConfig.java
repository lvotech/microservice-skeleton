package com.answer;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RetryConfig {

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 5000, 5);
    }
}
