package com.cognive.app.base.rest.model;

import java.util.Date;

import com.cognive.core.model.base.ItemsPage;

public class BaseResourceFilter extends ItemsPage {

	private String name;
	private String type;
	private String kind;
	private String createdBy;
	private Date createdBefore;
	private Date createdAfter;

}
