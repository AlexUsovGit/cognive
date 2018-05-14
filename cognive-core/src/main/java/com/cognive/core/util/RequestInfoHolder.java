package com.cognive.core.util;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.cognive.core.model.RequestInfo;

@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class RequestInfoHolder implements ContextHolder<RequestInfo> {
	
	private RequestInfo info;

	@Override
	public void set(RequestInfo item) {
		this.info = item;
	}

	@Override
	public RequestInfo get() {
		return info;
	}

	@Override
	public void remove() {
		this.info = null;
	}

}
