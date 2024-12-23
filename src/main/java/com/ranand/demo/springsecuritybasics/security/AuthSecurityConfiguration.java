package com.ranand.demo.springsecuritybasics.security;

import com.ranand.demo.springsecuritybasics.models.Roles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Ramesh Anand
 */
@Configuration
public class AuthSecurityConfiguration {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl) requests.anyRequest()).authenticated();
        });
        http.csrf().disable();
       // http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain) http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User.withUsername("ranand").password("{noop} password").roles(String.valueOf(Roles.USER)).build();
        UserDetails user2 = User.withUsername("ranand_admin").password("{noop} password").roles(String.valueOf(Roles.ADMIN)).build();
        UserDetails user3 = User.withUsername("ranand_ops").password("{noop} password").roles(String.valueOf(Roles.OPSADMIN)).build();
        return new InMemoryUserDetailsManager();
    }
}
