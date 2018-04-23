package com.cognive.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class InitCoreApplicationListener implements ApplicationListener<ApplicationEvent> {

	private static final Logger logger = LoggerFactory.getLogger(InitCoreApplicationListener.class);
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ApplicationStartedEvent) {
			
		}
	}
	
}
