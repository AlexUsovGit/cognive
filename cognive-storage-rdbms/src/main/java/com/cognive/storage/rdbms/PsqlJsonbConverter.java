package com.cognive.storage.rdbms;

import java.io.IOException;

import javax.persistence.Converter;

import org.postgresql.util.PGobject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// Do not use 
// need to set
//  spring.datasource.url=jdbc:postgresql://localhost:5432/dbname?stringtype=unspecified or
//  spring.datasource.connection-properties=stringtype=unspecified
// entity should have 
// @Convert(converter = PsqlJsonbConverter.class)

@Converter(autoApply = true)
public class PsqlJsonbConverter implements javax.persistence.AttributeConverter<JsonNode, Object> {

	public static final String TYPE_JSONB = "jsonb";
	private static ObjectMapper mapper = new ObjectMapper();

	@Override
	public Object convertToDatabaseColumn(JsonNode objectValue) {
		try {
			PGobject out = new PGobject();
			out.setType(TYPE_JSONB);
			out.setValue(mapper.writeValueAsString(objectValue)); //objectValue.toString()
			return out;
		} catch (Exception e) {
			throw new IllegalArgumentException("Unable to serialize to json field ", e);
		}
	}

	@Override
	public JsonNode convertToEntityAttribute(Object dataValue) {
		try {
			if (dataValue instanceof PGobject && ((PGobject) dataValue).getType().equals(TYPE_JSONB)) {
				// return mapper.readValue(((PGobject) dataValue).getValue(), JsonNode.class);
				return mapper.readTree(((PGobject) dataValue).getValue());
			}
			return null;
		} catch (IOException e) {
			throw new IllegalArgumentException("Unable to deserialize to json field ", e);
		}
	}
}
