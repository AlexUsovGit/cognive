package com.cognive.storage.app.rdbms.entity.dict;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseDictEntity;

@Entity
@Table(name = "dict_cities")
public class DictCityEntity extends BaseDictEntity {

	private String countryId;
	
}
