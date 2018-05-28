package com.cognive.core.service.base;

import java.util.List;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.model.base.ModifiableBoFilter;

public interface BaseModifiableBoCrudService<T extends BaseModifiableBusinessObject> {

	T create(T bo);

	T getById(Long id);

	List<T> find(ModifiableBoFilter filter);

	T update(T bo);

	void delete(Long id);

}