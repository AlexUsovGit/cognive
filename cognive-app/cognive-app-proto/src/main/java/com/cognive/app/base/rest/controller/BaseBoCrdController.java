package com.cognive.app.base.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.base.BaseBusinessObject;
import com.cognive.core.model.base.ModifiableBoFilter;
import com.cognive.core.service.base.BaseBoCrudService;

abstract public class BaseBoCrdController<T extends BaseBusinessObject> extends BaseController<T> {

	@Autowired
	protected BaseBoCrudService<T> boService;

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
	
	@DeleteMapping("/{id}")
	public ContentMessage<T> delete(@PathVariable(name = "id", required = true) long id) {
		boService.delete(id);
		return getEmptyContentMessage();
	}
	
}
