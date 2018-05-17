package com.cognive.app.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseBoCrdController;
import com.cognive.core.model.common.Address;

@RestController
@RequestMapping("/api/v1/bo/attachment")
public class AttachmentCrdController extends BaseBoCrdController<Address> {

}
