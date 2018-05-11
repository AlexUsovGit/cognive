package com.cognive.core;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.cognive.core.module.ModuleRegistry;
import com.cognive.core.module.ServiceRegistry;
import com.cognive.core.module.model.web.WebUiDesciptor;

@Component
public class CogniveApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(CogniveApplication.class);
	
	@Autowired
	private ApplicationContext context;

	private ModuleRegistry moduleRegistry;
	private ServiceRegistry serviceRegistry;

	@PostConstruct
	public void init() {
		
	}
	
	public WebUiDesciptor getWebUiDesciptor() {
		WebUiDesciptor result = new WebUiDesciptor();
		return result ;
	}
	
}
