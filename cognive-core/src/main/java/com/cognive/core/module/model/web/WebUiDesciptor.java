package com.cognive.core.module.model.web;

import java.util.List;
import java.util.Map;

public class WebUiDesciptor {

	private List<String> staticResources;
	private List<MenuItem> mainMenuItems;
	private List<MenuItem> headerItems;
	private Map<String, WebUiComponent> uiComponents; // data for routes

	public List<String> getStaticResources() {
		return staticResources;
	}

	public void setStaticResources(List<String> staticResources) {
		this.staticResources = staticResources;
	}

	public List<MenuItem> getMainMenuItems() {
		return mainMenuItems;
	}

	public void setMainMenuItems(List<MenuItem> mainMenuItems) {
		this.mainMenuItems = mainMenuItems;
	}

	public List<MenuItem> getHeaderItems() {
		return headerItems;
	}

	public void setHeaderItems(List<MenuItem> headerItems) {
		this.headerItems = headerItems;
	}

	public Map<String, WebUiComponent> getUiComponents() {
		return uiComponents;
	}

	public void setUiComponents(Map<String, WebUiComponent> uiComponents) {
		this.uiComponents = uiComponents;
	}

}
