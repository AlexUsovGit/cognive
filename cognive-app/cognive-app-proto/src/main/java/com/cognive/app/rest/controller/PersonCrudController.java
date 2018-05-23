package com.cognive.app.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseBoCrudController;
import com.cognive.core.model.common.Person;

@RestController
@RequestMapping("/api/v1/bo/person")
public class PersonCrudController extends BaseBoCrudController<Person> {
	
}
