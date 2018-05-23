package com.cognive.storage.app.rdbms.mapper;

import java.util.IdentityHashMap;
import java.util.Map;

import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

/*
 * The class usage:
 *  @Mapping(source = "employeeName", target = "name")
 *  Employee toEmployee(EmployeeDto employeeDto, @Context CycleAvoidingMappingContext context);
 */

public class CycleAvoidingMappingContext {
	private Map<Object, Object> knownInstances = new IdentityHashMap<Object, Object>();

	@BeforeMapping
	public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
		return (T) knownInstances.get(source);
	}

	@BeforeMapping
	public void storeMappedInstance(Object source, @MappingTarget Object target) {
		knownInstances.put(source, target);
	}
	
}
