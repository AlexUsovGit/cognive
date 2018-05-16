package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.Address;
import com.cognive.storage.app.rdbms.entity.common.AddressEntity;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper extends BaseEntityMapper<Address, AddressEntity> {

}
