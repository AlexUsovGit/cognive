package com.cognive.core.serialization;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DefaultJsonObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = -6590118515236165844L;

	// TODO: remove or remake as thread local
	final public static DefaultJsonObjectMapper INSTANCE = new DefaultJsonObjectMapper();

	public final static String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public final static String DATE_TIMEZONE = "UTC";
	
	public DefaultJsonObjectMapper() {
		enable(SerializationFeature.INDENT_OUTPUT);
		configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		setSerializationInclusion(Include.NON_NULL);
		
		enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		SimpleDateFormat timestampFormat = new SimpleDateFormat(DATE_FORMAT);
		timestampFormat.setTimeZone(TimeZone.getTimeZone(DATE_TIMEZONE));
		setDateFormat(timestampFormat);
	}
	
}
