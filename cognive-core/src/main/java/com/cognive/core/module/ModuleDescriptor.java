package com.cognive.core.module;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.cognive.core.module.model.web.WebUiDesciptor;

public class ModuleDescriptor {

	private String family;
	private String name;
	private String version;
	private String type;
	
	private WebUiDesciptor webUiDesciptor;
	
	public List<String> checkDependencies() {
		return null;
	}

	public List<String> getSpringProfiles() {
		return null;
	}
	
	public WebUiDesciptor getWebUiDesciptor() {
		return null;
	}
	
	public Map<String, DataSource> getDbDataSources() {
		return null;
	}

	public Map<String, String> getRequiredConfigurationProperties() {
		return null;
	}
	
	public Map<String, String> getUsedSecurityPermissions() {
		return null;
	}
	
	public Map<String, String> getEndpoints() {
		return null;
	}

	public List<String> getI18nPackages() {
		return null;
	}
}
