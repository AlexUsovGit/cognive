package com.cognive.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseDictController;
import com.cognive.app.base.rest.model.messages.ContentListMessage;
import com.cognive.core.model.base.BaseDictItem;
import com.cognive.core.model.dict.CountryDictItem;
import com.cognive.core.model.dict.KinshipTypeDictItem;
import com.cognive.core.service.dict.CountryDictService;
import com.cognive.core.service.dict.KinshipTypeDictService;

@RestController
@RequestMapping("/api/v1/dict")
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
