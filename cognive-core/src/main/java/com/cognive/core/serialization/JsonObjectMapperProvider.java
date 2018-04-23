package com.cognive.core.serialization;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
// @Provider
public class JsonObjectMapperProvider { //implements ContextResolver<ObjectMapper> {
	private ObjectMapper objectMapper;
	
	public JsonObjectMapperProvider() {
		objectMapper = createObjectProvider();
	}
	
	protected ObjectMapper createObjectProvider() {
		return new DefaultJsonObjectMapper();
	}

//	@Override
//	public ObjectMapper getContext(Class<?> type) {
//		return objectMapper;
//	}
}
