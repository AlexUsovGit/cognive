package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.dict.KinshipTypeDictItem;
import com.cognive.storage.app.rdbms.entity.dict.DictKinshipTypeEntity;

@Mapper(componentModel = "spring")
public interface KinshipTypeDictItemMapper extends BaseDictItemMapper<KinshipTypeDictItem, DictKinshipTypeEntity> {

}
