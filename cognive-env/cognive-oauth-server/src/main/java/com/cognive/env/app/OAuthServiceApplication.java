/**
 * 
 */
package com.cognive.env.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author 1
 *
 */

@EnableAuthorizationServer
@SpringBootApplication
public class OAuthServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OAuthServiceApplication.class, args);
	}
}
