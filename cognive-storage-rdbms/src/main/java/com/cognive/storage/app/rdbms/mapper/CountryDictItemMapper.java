package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.CountryDictItem;
import com.cognive.storage.app.rdbms.entity.DictCountryEntity;

@Mapper(componentModel = "spring")
public interface CountryDictItemMapper extends BaseDictItemMapper<CountryDictItem, DictCountryEntity> {

}
