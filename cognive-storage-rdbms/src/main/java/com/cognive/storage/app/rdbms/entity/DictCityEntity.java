package com.cognive.storage.app.rdbms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseDictEntity;

@Entity
@Table(name = "dict_cities")
public class DictCityEntity extends BaseDictEntity {

	private String countryId;
	
}
