package com.cognive.app.base.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.service.base.BaseModifiableBoCrudService;

abstract public class BaseBoCrudController<T extends BaseModifiableBusinessObject> extends BaseBoCrdController<T> {

	@Autowired
	BaseModifiableBoCrudService<T> boService;

	@PutMapping("/{id}")
	public ContentMessage<T> update(@PathVariable(name = "id", required = true) long id, @RequestBody T bo) {
		assertRequestBodyNotNull(bo, null);
		bo.setId(id);
		return asContentMessage( boService.update(bo) );
	}
	
	@PatchMapping("/{id}")
	public ContentMessage<T> patch(@PathVariable(name = "id", required = true) long id, @RequestBody T bo) {
		assertRequestBodyNotNull(bo, null);
		bo.setId(id);
		return asContentMessage( boService.update(bo) );
	}

}
