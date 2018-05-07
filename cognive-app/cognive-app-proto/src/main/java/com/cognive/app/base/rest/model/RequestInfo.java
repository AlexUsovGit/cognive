package com.cognive.app.base.rest.model;

import java.util.Date;
import java.util.Map;

public class RequestInfo {

	private String requestKey;
	private String url;
	private String method;
	private String user;
	private Date date;
	private Map<String, String> extra;

	public String getRequestKey() {
		return requestKey;
	}

	public void setRequestKey(String requestKey) {
		this.requestKey = requestKey;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, String> getExtra() {
		return extra;
	}

	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
}
