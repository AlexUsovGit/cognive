package com.cognive.storage.app.rdbms.entity.dict;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cognive.storage.rdbms.entity.BaseDictEntity;

@Entity
@Table(name = "dict_kinship")
public class DictKinshipTypeEntity extends BaseDictEntity implements Serializable {

}
