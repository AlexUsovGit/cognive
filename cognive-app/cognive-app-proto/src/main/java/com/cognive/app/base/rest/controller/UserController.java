package com.cognive.app.base.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.core.model.AppUser;

@RestController
@RequestMapping("/api/v1")
public class UserController extends BaseController<AppUser> {

	@GetMapping("/user")
	public ContentMessage<AppUser> getCurrentUser() {
		AppUser user = new AppUser();
		user.setUid("default");
		return asContentMessage(user);
	}
	
}
