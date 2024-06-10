package dio.spring.security.repository;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public interface WebSecurityConfigurerAdapter {
    void configure (AuthenticationManagerBuilder auth) throws Exception;
}
