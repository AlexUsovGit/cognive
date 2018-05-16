package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.dict.CountryDictItem;
import com.cognive.storage.app.rdbms.entity.dict.DictCountryEntity;

@Mapper(componentModel = "spring")
public interface CountryDictItemMapper extends BaseDictItemMapper<CountryDictItem, DictCountryEntity> {

}
