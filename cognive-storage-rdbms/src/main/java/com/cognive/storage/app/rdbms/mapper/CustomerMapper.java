package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.business.Customer;
import com.cognive.storage.app.rdbms.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	// CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
    Customer customerToCustomerEntity(CustomerEntity entity);
	
    CustomerEntity customerEntityToCustomer(Customer bo);
	
}
