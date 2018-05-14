package com.cognive.app.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors()
				.and()
			.authorizeRequests()
				.antMatchers("/static/css/**", "/static/img/**", "/intro.html", "/login.html").permitAll()
	            .anyRequest().authenticated()
	            // .antMatchers("/api/**").authenticated()
	            .and()
	        .exceptionHandling()
	        	.defaultAuthenticationEntryPointFor(getRestAuthenticationEntryPoint(), new AntPathRequestMatcher("/api/**"))
	        	.and()
	        .formLogin()
	            .loginPage("/login.html")
	            // .permitAll()
	            .loginProcessingUrl("/login.html")
                .defaultSuccessUrl("/")
                // .failureUrl("/login.html?error")
                .and()
	        .logout()
	        	.logoutUrl("/logout")
	        	.logoutSuccessUrl("/login.html")
	            .permitAll()
	            .and()
// 	        .exceptionHandling().accessDeniedPage("/access-denied.html")
//	        	.and()
	        .httpBasic() // TODO: remove
	        	.and()
	        .csrf()
	        	.disable()
//	        	.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	            ;
	}
	
//	@Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/static/**");
//    }	
	
    @Bean // or @CrossOrigin(origins = "http://localhost:8080")
    public CorsConfigurationSource corsConfigurationSource() {
    	// for all endpoints
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // set values from config like new CorsConfiguration().addAllowedOrigin(origin);
        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
        return source;
    }
    
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
    	// FIXME: use dev profile
    	// Authorization: Basic dXNlcjpwYXNzd29yZA==
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        // Authorization: Basic YWRtaW46cGFzc3dvcmQ=
        UserDetails admin =
                User.withDefaultPasswordEncoder()
                   .username("admin")
                   .password("password")
                   .roles("ADMIN")
                   .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
    
    private AuthenticationEntryPoint getRestAuthenticationEntryPoint() {
        return new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED);
    }    
    
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//      throws Exception {
//  
//        auth.inMemoryAuthentication()
//          .withUser("admin").password("password").roles("ADMIN")
//          .and()
//          .withUser("user").password("password").roles("USER");
//    }    
}

//@Override
//public void addCorsMappings(CorsRegistry registry) {
//	registry.addMapping("/api/**")
//		.allowedOrigins("http://domain2.com")
//		.allowedMethods("PUT", "DELETE")
//			.allowedHeaders("header1", "header2", "header3")
//		.exposedHeaders("header1", "header2")
//		.allowCredentials(false).maxAge(3600);
//}
