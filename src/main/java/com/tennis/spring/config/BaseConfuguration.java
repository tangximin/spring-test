package com.tennis.spring.config;

import com.tennis.spring.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfuguration {

    @Bean
    public UserEntity newEntity(){
        return new UserEntity();
    }
}
