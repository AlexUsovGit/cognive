package com.cognive.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseController;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.common.Document;
import com.cognive.core.model.filter.DocumentSearchFilter;
import com.cognive.core.service.DocumentService;

@RestController
@RequestMapping("/api/v1/search/document")
public class DocumentSearchController extends BaseController<Document> {
	
	@Autowired
	protected DocumentService documentService;

	@GetMapping("/filter/{personId}")
	public PagedContentMessage<Document> find(
			@PathVariable(name="personId", required=true) long personId,
			DocumentSearchFilter filter) {
		
		return asPagedContentMessage( documentService.findPersonId(personId, filter), filter.cloneAsItemsPage());
	}
		
}
