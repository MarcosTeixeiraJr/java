package dio.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityDatabaseService securityService;

    @Autowired
    public void globalUserDetails (@org.jetbrains.annotations.NotNull AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/login").permitAll()
                .antMatchers("/managers").hasAnyRole("MANAGERS")
                .antMatchers("/users").hasAnyRole("USERS", "MANAGERS")
                .anyRequest().authenticated().and().httpBasic();

    }
    /*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configura a autenticação em memória com dois usuários
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}user123") // {noop} indica que a senha não está encriptada
                .roles("USERS") // Papel do usuário
                .and()
                .withUser("admin")
                .password("{noop}master123") // {noop} indica que a senha não está encriptada
                .roles("MANAGERS"); // Papel do administrador
    }
    */
}
