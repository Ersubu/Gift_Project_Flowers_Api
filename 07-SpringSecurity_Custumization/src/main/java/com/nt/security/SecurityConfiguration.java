package com.nt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((request) -> request
                        .antMatchers("/", "/loginCheck", "/about").permitAll()
                        .anyRequest().authenticated()
        ).formLogin();
		
		return http.build();
	
		
	}

}
