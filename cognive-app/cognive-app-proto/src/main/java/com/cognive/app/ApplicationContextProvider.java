package com.cognive.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationContextProvider.class);
	
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		logger.debug("ApplicationContextProvider got context: " 
				+ applicationContext.getApplicationName() + " " 
				+ applicationContext.getDisplayName() + " "
				+ applicationContext.getId());
		
		logger.debug("\tbeans:");
		for (String tmp : applicationContext.getBeanDefinitionNames()) {
			logger.debug("\t\t " + tmp);
		}
		
		if (applicationContext.getEnvironment() instanceof ConfigurableEnvironment) {
			ConfigurableEnvironment env = (ConfigurableEnvironment) applicationContext.getEnvironment(); 
			for (PropertySource<?> tmp : env.getPropertySources()) {
				logger.debug("\tvars from " + tmp.getName());
	            if (tmp instanceof MapPropertySource) {
	            	for(String name : ((MapPropertySource) tmp).getPropertyNames()) {
	    				logger.debug("\t\t " + name + "=" + tmp.getProperty(name));
	            	}
	            }
			}
		}
		
        Map<String, Object> map = new HashMap();
        for(Iterator it = ((AbstractEnvironment) applicationContext.getEnvironment()).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySource propertySource = (PropertySource) it.next();
            if (propertySource instanceof MapPropertySource) {
                map.putAll(((MapPropertySource) propertySource).getSource());
            }
        }		
	}

	public ApplicationContext getContext() {
		return applicationContext;
	}
}
