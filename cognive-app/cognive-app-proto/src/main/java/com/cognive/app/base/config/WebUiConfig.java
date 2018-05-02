package com.cognive.app.base.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebUiConfig implements WebMvcConfigurer {

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.ENGLISH);
		return localeResolver;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// registry.addRedirectViewController("/","index.html");
		// registry.addRedirectViewController("/index.html?*","/index.html");
		// registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}	

//	@Override - remove
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
        		.addResourceLocations("/META-INF/resources/", "classpath:/public/" , "classpath:/public-default/");
		// "classpath:/webjars/", "/webjars/", 
    }
	
	// TODO: remove	
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		configurer.favorPathExtension(false)
//			.favorParameter(true)
//			.parameterName("mediaType")
//			.ignoreAcceptHeader(true)
//			.useJaf(false)
//			.defaultContentType(MediaType.APPLICATION_JSON)
//			.mediaType("xml", MediaType.APPLICATION_XML)
//			.mediaType("json", MediaType.APPLICATION_JSON);
//	}	
	
	// TODO: make configurable, or check SB ref docs for cros properties
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("*");
//    }	
}
