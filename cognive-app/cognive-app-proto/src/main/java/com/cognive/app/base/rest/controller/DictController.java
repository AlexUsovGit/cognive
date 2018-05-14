package com.cognive.app.base.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.model.messages.ContentListMessage;
import com.cognive.core.model.CountryDictItem;
import com.cognive.core.model.KinshipTypeDictItem;
import com.cognive.core.model.base.BaseDictItem;
import com.cognive.core.service.CountryDictService;
import com.cognive.core.service.KinshipTypeDictService;

@RestController
@RequestMapping("/api/v1/user")
public class DictController extends BaseDictController<BaseDictItem> {

	// TODO: make crud by type?
	
	@Autowired
	CountryDictService countryDictService; 
	
	@Autowired
	KinshipTypeDictService kinshipTypeDictService; 
	
	@GetMapping("/countries")
	public ContentListMessage<CountryDictItem> getAllCountries() {
		return asContentListMessage(countryDictService.findAll(), CountryDictItem.class);
	}
	
	@GetMapping("/kinshipTypes")
	public ContentListMessage<KinshipTypeDictItem> getAllKinshipTypes() {
		return asContentListMessage(kinshipTypeDictService.findAll(), KinshipTypeDictItem.class);
	}
	
}
