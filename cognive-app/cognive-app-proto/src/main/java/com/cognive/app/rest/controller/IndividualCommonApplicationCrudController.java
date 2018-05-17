package com.cognive.app.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognive.app.base.rest.controller.BaseBoCrudController;
import com.cognive.core.model.business.IndividualCommonApplication;

@RestController
@RequestMapping("/api/v1/bo/personApplication")
public class IndividualCommonApplicationCrudController extends BaseBoCrudController<IndividualCommonApplication> {

}
