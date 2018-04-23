package com.cognive.core.module;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Service;

@Service
public class ModuleRegistry {
	
	private static final Logger logger = LoggerFactory.getLogger(ModuleRegistry.class);
	
	private List<ModuleDescriptor> appModules;
	private List<ModuleDescriptor> knownModules;
	
	@Autowired
	private ApplicationContext context;
	
	@PostConstruct
	public void init() {
		// or org.springframework.context.ApplicationListener + ApplicationStartedEvent
		
		// loadCustomI18nMessages();
	}
	
	protected boolean checkModulesDependencies() {
		return true;
	}

	protected void loadCustomI18nMessages() {
		try {
			ReloadableResourceBundleMessageSource ms = context.getBean(ReloadableResourceBundleMessageSource.class);
			if (ms == null) {
				logger.error("Fail to update MessageSource. App context does not contain ReloadableResourceBundleMessageSource.");
				// ToDo: recheck if it is default impl.
				// @Bean public MessageSource messageSource() { 
				// new ReloadableResourceBundleMessageSource
				// .addBasename("classpath:messages")
				// return it}
			}
			
			appModules.forEach( mdl -> {
				mdl.getI18nPackages().forEach( ms::addBasenames );
			});
		} catch (Exception e) {
			logger.error("Fail to update MessageSource with data from modules.", e);
		}
	}
}
