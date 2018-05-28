package com.cognive.app.rest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseController;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.common.Person;
import com.cognive.core.model.filter.PersonSearchFilter;
import com.cognive.core.service.PersonService;

@RestController
@RequestMapping("/api/v1/search/person")
public class PersonSearchController extends BaseController<Person> {
	
	@Autowired
	protected PersonService personService;

	@GetMapping("/filter")
	public PagedContentMessage<Person> find(PersonSearchFilter filter) {
		return asPagedContentMessage( personService.find(filter), filter.cloneAsItemsPage());
	}
		
	
	@GetMapping("/map")
	public PagedContentMessage<Person> find(Map<String, String> filter) {
		// return asPagedContentMessage( personService.find(filter), filter.cloneAsItemsPage());
		return null;
	}
		
}
