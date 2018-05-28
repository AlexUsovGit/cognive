package com.cognive.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseBoCrudController;
import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.core.model.common.Person;
import com.cognive.core.service.PersonService;

@RestController
@RequestMapping("/api/v1/bo/person")
public class PersonCrudController extends BaseBoCrudController<Person> {
	
	@Autowired
	protected PersonService personService;
	
	@GetMapping("/{id}")
	@Override
	public ContentMessage<Person> getById(@PathVariable(name = "id", required = true) Long id) {
		return asContentMessage( personService.getFullById(id) );
	}
	
}
