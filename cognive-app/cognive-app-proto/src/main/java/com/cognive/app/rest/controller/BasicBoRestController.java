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
	public ContentMessage<BasicBo> getById(@PathVariable("id") String id) {
		return asContentMessage( basicBoService.getById(id) );
	}
	
	@GetMapping("/")
	public PagedContentMessage<BasicBo> find(BasicBoFilter filter) {
		return asPagedContentMessage( basicBoService.find(filter), filter.cloneAsItemsPage());
	}
	
	@PostMapping("/")
	public ContentMessage<BasicBo> create(@RequestBody BasicBo bo) {
		return asContentMessage( basicBoService.create(bo) );
	}
	
	@PutMapping("/{id}")
	public ContentMessage<BasicBo> update(@PathVariable("id") String id, @RequestBody BasicBo bo) {
		return asContentMessage( basicBoService.update(bo) );
	}
	
	@PatchMapping("/{id}")
	public ContentMessage<BasicBo> patch(@PathVariable("id") String id, @RequestBody BasicBo bo) {
		return asContentMessage( basicBoService.update(bo) );
	}
	
	@DeleteMapping("/{id}")
	public ContentMessage<BasicBo> delete(@PathVariable("id") String id) {
		basicBoService.delete(id);
		return getEmptyContentMessage();
	}
	
}
