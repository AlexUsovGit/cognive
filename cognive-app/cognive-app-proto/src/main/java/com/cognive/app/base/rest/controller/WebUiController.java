/**
 * 
 */
package com.cognive.app.base.rest.controller;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.core.module.model.web.MenuItem;
import com.cognive.core.module.model.web.WebUiComponent;
import com.cognive.core.module.model.web.WebUiDesciptor;

/**
 * @author 1
 *
 */
@RestController
@RequestMapping("/api/v1/app")
public class WebUiController {

	@GetMapping("/ui-descriptor")
	public WebUiDesciptor getWebUiDesciptor() {
		WebUiDesciptor result = new WebUiDesciptor();
		
		// FIXME: tmp code. The class content will be loaded from the modules cfg
		
		Map<String, WebUiComponent> uiComponents = new LinkedHashMap<>();
		
		WebUiComponent baseCmpn = new WebUiComponent();
		baseCmpn.setImportPath("@/components/layout/BaseLayout");
		baseCmpn.setName("BaseLayout");
		uiComponents.put(baseCmpn.getName(), baseCmpn);
		result.setUiComponents(uiComponents);
		
		List<MenuItem> menuItems = new LinkedList<MenuItem>();
		
		MenuItem main = new MenuItem();
		main.setId("1");
		main.setLabel("Dashboard");
		main.setIcon("icon_24_ic_poll");
		main.setLink("/");
		main.setComponent(baseCmpn.getName());
		menuItems.add(main);
		result.setMainMenuItems(menuItems );
		
		return result;
	} 
	
}
