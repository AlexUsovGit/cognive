package com.cognive.core.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognive.core.serialization.DefaultJsonObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class ModuleDescriptorLoader {

	public static final String CGN_MODULE_JSON = "/cgn-module.json";
	public static final String CGN_MODULE_YAML = "/cgn-module.yaml";

	private static final Logger logger = LoggerFactory.getLogger(ModuleDescriptorLoader.class);
	
	// ObjectMapper jsonObjectMapper = DefaultJsonObjectMapper.INSTANCE;
	protected ObjectReader jsonObjectReader = DefaultJsonObjectMapper.INSTANCE.reader(); 

	
	public ModuleDescriptor loadDefault(String moduleId) {
		if (moduleId == null) {
			moduleId = "";
		}
		// rework with exceptions
		ModuleDescriptor result = loadJsonFromResources(moduleId + CGN_MODULE_JSON);
		if (result == null) {
			result = loadJsonFromResources(moduleId + CGN_MODULE_YAML);
		}
		if (result == null) {
			logger.warn("Failed to load module descriptor for ID:" + moduleId);
		}
		return result;
	}
	
	public ModuleDescriptor loadJsonFromResources(String resourceLocation) {
		try {
			// classloaders?
			return jsonObjectReader.readValue( getClass().getResourceAsStream(resourceLocation) );
		} catch (Exception e) {
			logger.warn("Failed to parse module descriptor from resource " + resourceLocation, e);
		}
		return null;
	}
	
	public ModuleDescriptor loadYamlFromResources(String resourceLocation) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
	
	protected boolean verifyResourceLocation(String resourceLocation) {
		if (resourceLocation == null || resourceLocation.isEmpty()) {
			return false;
		}
		if (resourceLocation.contains("://")) {
			// log: resourceLocation can not contain any protocol. Only classpath is allowed.
			return false;
		}
		return true;
	}
	
}
