	/**
 * 
 */
package com.cognive.app;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.cognive.app.base.servlet.DefaultErrorServlet;
import com.cognive.core.serialization.DefaultJsonObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author AndreyGabrinovich
 *
 */

@SpringBootApplication
public class ProtoModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtoModuleApplication.class, args);
	}

	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
		// TODO: rework: use spring config to create a default object mapper
		// or make JacksonConfigurations
	    Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
	    builder.serializationInclusion(JsonInclude.Include.NON_NULL);
	    
	    builder.featuresToEnable(SerializationFeature.INDENT_OUTPUT);
	    builder.featuresToDisable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		
	    builder.featuresToEnable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	    builder.featuresToDisable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		SimpleDateFormat timestampFormat = new SimpleDateFormat(DefaultJsonObjectMapper.DATE_FORMAT);
		timestampFormat.setTimeZone(TimeZone.getTimeZone(DefaultJsonObjectMapper.DATE_TIMEZONE));
		builder.dateFormat(timestampFormat);

	    return builder;
	}
	
    @Bean
    public ServletRegistrationBean<DefaultErrorServlet> defaultErrorServletRegistrationBean() {
        ServletRegistrationBean<DefaultErrorServlet> servletRegistrationBean = new ServletRegistrationBean<>(
        		new DefaultErrorServlet(), "/error");
        servletRegistrationBean.setName(DefaultErrorServlet.class.getName());
        return servletRegistrationBean;
    }	
	
//	@Bean
//    public ServletRegistrationBean dispatcherServletRegistrationBean() {
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(WebUiConfig.class);
//        dispatcherServlet.setApplicationContext(applicationContext);
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/*");
//        servletRegistrationBean.setName(DispatcherServlet.class.getName());
//        servletRegistrationBean.setLoadOnStartup(1);
//        return servletRegistrationBean;
//    }
	
}
