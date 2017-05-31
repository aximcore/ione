package me.aximcore.security;

import me.aximcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by aximc on 2017. 04. 18..
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http    .authorizeRequests()
                    .antMatchers("/css/**", "/js/**", "/images/**", "/fonts/**",
                            "/").permitAll()
                    .antMatchers("/task/all").hasAnyRole("ADMIN", "SALES_ADMIN")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/")//.failureUrl("/login-error")
                    .permitAll()
                    .successForwardUrl("/user/task")
                    .and()
                .logout()
                    .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //auth    .inMemoryAuthentication()
        //            .withUser("user").password("pass").roles("USER");
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

}
