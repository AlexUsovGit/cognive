/**
 * 
 */
package com.cognive.app.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseController;
import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.core.model.Customer;

/**
 * @author AndreyGabrinovich
 *
 */
@RestController
@RequestMapping("/api/v1")
public class CustomerController extends BaseController<Customer> {

	@GetMapping("/customer/{id}")
	public ContentMessage<Customer> getCurrentUser(String id) {
		return asContentMessage(null);
	}

}
