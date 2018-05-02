/**
 * 
 */
package com.cognive.app.base.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.model.WebUiPageLayout;

/**
 * @author 1
 *
 */
@RestController
@RequestMapping("/api/v1/app")
public class WebUiController {

	@GetMapping("/module")
	public WebUiPageLayout getWebUiPageLayout() {
		WebUiPageLayout result = new WebUiPageLayout();
		return result ;
	} 
	
}
