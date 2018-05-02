package com.cognive.storage.rdbms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.cognive.core.model.Customer;
import com.cognive.storage.rdbms.entity.CustomerEntity;

@Mapper
public interface CustomerMapper {

	CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
    @Mapping(target = "")
    Customer customerToCustomerEntity(CustomerEntity entity);
	
    @Mapping(target = "")
    CustomerEntity customerEntityToCustomer(Customer bo);
	
}
