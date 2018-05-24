package com.cognive.app.base.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForwardController {

	@RequestMapping(value = "/**/{[path:[^\\.]*}", method = RequestMethod.GET)
	public String redirect() {
		return "forward:/";
	}

	@RequestMapping(value = { "/**/login", "/**/recovery", "/**/recovery/{token}" }, method = RequestMethod.GET)
	public String redirectLogin() {
		return "forward:/login.html";
	}

//	@RequestMapping(value = "/**/{[path:[^\\.]*}")
//	public String redirect() {
//		return "forward:/";
//	}

	// @RequestMapping(value = "{path}", method = RequestMethod.GET)
	// public String redirect(@PathVariable String path) {
	// String route = null;
	// if (path.equals("/") || path.startsWith("index") || path.startsWith("login"))
	// {
	// route = path;
	// } else {
	// route = "redirect:/index/#/redirect/" + path;
	// }
	// return route;
	// }

}