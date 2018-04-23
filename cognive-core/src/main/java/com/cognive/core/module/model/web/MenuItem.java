package com.cognive.core.module.model.web;

import java.util.List;

public class MenuItem {

	private String id;
	private String label;
	private String link; // ? resolve based on id? external link?
	private String style; 
	private String icon; // remove? use more generic - style
	private List<MenuItem> items;
	
}
