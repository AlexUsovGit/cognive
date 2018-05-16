package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.common.PhoneNumber;
import com.cognive.storage.app.rdbms.entity.common.PhoneNumberEntity;

@Mapper(componentModel = "spring")
public interface PhoneNumberEntityMapper extends BaseEntityMapper<PhoneNumber, PhoneNumberEntity> {

}
