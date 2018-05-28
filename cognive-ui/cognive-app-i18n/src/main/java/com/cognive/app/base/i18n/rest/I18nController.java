/**
 * 
 */
package com.cognive.app.base.i18n.rest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AndreyGabrinovich
 *
 */
@RestController
@RequestMapping("/api/v1/app/i18n")
public class I18nController {

	@GetMapping("/{key}/{locale}")
	@ResponseBody
	public Resource getCurrentUser(
			@PathVariable(name = "key", required = true) String key, 
			@PathVariable(name = "locale", required = true) String locale) {
		
		// This will set the content-length and content-type if it can determine the mime-type
		// see ResourceHttpMessageConverter
		return new ClassPathResource( getResourceLocation(key, locale) );
	}

	protected String getResourceLocation(String key, String locale) {
		StringBuilder result = new StringBuilder();
		result.append("i18n/");
		result.append(key);
		result.append("_");
		result.append(locale);
		result.append(".json");
		
		return result.toString();
	}

}
