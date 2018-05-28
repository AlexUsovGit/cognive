package com.cognive.core.service.base;

import java.util.List;

import com.cognive.core.model.base.BaseBoFilter;
import com.cognive.core.model.base.BaseBusinessObject;

public interface BaseBoCrudService<T extends BaseBusinessObject> {

	T create(T bo);

	T getById(Long id);

	List<T> find(BaseBoFilter filter);

	void delete(Long id);

}