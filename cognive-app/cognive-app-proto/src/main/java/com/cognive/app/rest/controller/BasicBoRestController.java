package com.cognive.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseController;
import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.BasicBo;
import com.cognive.core.model.BasicBoFilter;
import com.cognive.core.service.BasicBoService;

@RestController
@RequestMapping("/api/v1/basic")
public class BasicBoRestController extends BaseController<BasicBo> {
	
	@Autowired
	BasicBoService basicBoService;

	@GetMapping("/{id}")
	public ContentMessage<BasicBo> getById(@PathVariable(name = "id", required = true) long id) {
		return asContentMessage( basicBoService.getById(id) );
	}
	
	@GetMapping("")
	public PagedContentMessage<BasicBo> find(BasicBoFilter filter) {
		return asPagedContentMessage( basicBoService.find(filter), filter.cloneAsItemsPage());
	}
	
	@PostMapping("")
	public ContentMessage<BasicBo> create(@RequestBody BasicBo bo) {
		assertRequestBodyNotNull(bo, null);
		return asContentMessage( basicBoService.create(bo) );
	}
	
	@PutMapping("/{id}")
	public ContentMessage<BasicBo> update(@PathVariable(name = "id", required = true) long id, @RequestBody BasicBo bo) {
		assertRequestBodyNotNull(bo, null);
		bo.setId(id);
		return asContentMessage( basicBoService.update(bo) );
	}
	
	@PatchMapping("/{id}")
	public ContentMessage<BasicBo> patch(@PathVariable(name = "id", required = true) long id, @RequestBody BasicBo bo) {
		assertRequestBodyNotNull(bo, null);
		bo.setId(id);
		return asContentMessage( basicBoService.update(bo) );
	}
	
	@DeleteMapping("/{id}")
	public ContentMessage<BasicBo> delete(@PathVariable(name = "id", required = true) long id) {
		basicBoService.delete(id);
		return getEmptyContentMessage();
	}
	
}
