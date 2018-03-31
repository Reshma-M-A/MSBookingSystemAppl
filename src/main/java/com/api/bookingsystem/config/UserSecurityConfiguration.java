package com.api.bookingsystem.config;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

import com.api.bookingsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.api.bookingsystem.handler.UserAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class UserSecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    DataSource dataSource;

    @Autowired
    private UserAuthenticationSuccessHandler successHandler;

    //Enable authentication
    @Autowired
    public void configAuthentication (AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/welcome").hasAnyRole("USER", "ADMIN")
                .antMatchers("/getEmployees").hasAnyRole("USER", "ADMIN").antMatchers("/addNewEmployee")
                .hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().successHandler(successHandler)
                .loginPage("/login").permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

}
