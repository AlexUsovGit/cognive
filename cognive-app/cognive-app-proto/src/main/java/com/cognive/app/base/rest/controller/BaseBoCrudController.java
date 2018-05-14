package com.cognive.app.base.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.model.base.ModifiableBoFilter;
import com.cognive.core.service.base.BaseBoCrudService;

abstract public class BaseBoCrudController<T extends BaseModifiableBusinessObject> extends BaseController<T> {

	@Autowired
	BaseBoCrudService<T> boService;

	@GetMapping("/{id}")
	public ContentMessage<T> getById(@PathVariable(name = "id", required = true) long id) {
		return asContentMessage( boService.getById(id) );
	}
	
	@GetMapping("")
	public PagedContentMessage<T> find(ModifiableBoFilter filter) {
		return asPagedContentMessage( boService.find(filter), filter.cloneAsItemsPage());
	}
	
	@PostMapping("")
	public ContentMessage<T> create(@RequestBody T bo) {
		assertRequestBodyNotNull(bo, null);
		return asContentMessage( boService.create(bo) );
	}
	
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
	
	@DeleteMapping("/{id}")
	public ContentMessage<T> delete(@PathVariable(name = "id", required = true) long id) {
		boService.delete(id);
		return getEmptyContentMessage();
	}
	
}
