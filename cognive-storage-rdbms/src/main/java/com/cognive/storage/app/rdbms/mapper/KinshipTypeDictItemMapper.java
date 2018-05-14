package com.cognive.storage.app.rdbms.mapper;

import org.mapstruct.Mapper;

import com.cognive.core.model.KinshipTypeDictItem;
import com.cognive.storage.app.rdbms.entity.DictKinshipTypeEntity;

@Mapper(componentModel = "spring")
public interface KinshipTypeDictItemMapper extends BaseDictItemMapper<KinshipTypeDictItem, DictKinshipTypeEntity> {

}
