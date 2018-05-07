package com.cognive.app.base.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognive.app.base.exception.BadRequestCogniveRtException;
import com.cognive.app.base.rest.model.RequestInfo;
import com.cognive.app.base.rest.model.messages.ContentListMessage;
import com.cognive.app.base.rest.model.messages.ContentMessage;
import com.cognive.app.base.rest.model.messages.PagedContentMessage;
import com.cognive.core.model.base.ItemsPage;

public class BaseController<T> {

	@Autowired
	protected MessageSource messageSource;
	
	// @ExceptionHandler ? or @RestControllerAdvice
	
	protected String getMessage(String code) {
		return messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
	}
	
	protected String getMessage(String code, Object[] params) {
		return messageSource.getMessage(code, params, LocaleContextHolder.getLocale());
	}
	
	protected RequestInfo getRequestInfo() {
		// RequestInfo info = new RequestInfo();
		// info.setDate(new Date());
		return null;
	}	
	
	protected <E> ContentMessage<E> getEmptyContentMessage() {
		ContentMessage<E> result = new ContentMessage<>();
		result.setRequestInfo( getRequestInfo() );
		return result;
	}
	
	protected ContentMessage<T> asContentMessage(T item) {
		ContentMessage<T> result = new ContentMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setContent(item);
		return result;
	}
	
	protected PagedContentMessage<T> asPagedContentMessage(List<T> items, ItemsPage page) {
		PagedContentMessage<T> result = new PagedContentMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setPage(page);
		result.setItems(items);
		return result;
	}

	protected ContentListMessage<T> asContentListMessage(List<T> items) {
		ContentListMessage<T> result = new ContentListMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setItems(items);
		return result;
	}
	
	protected <T2> ContentMessage<T2> asContentMessage(T2 item, Class<T2> type) {
		ContentMessage<T2> result = new ContentMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setContent(item);
		return result;
	}
	
	protected <T2> ContentListMessage<T2> asContentListMessage(List<T2> items, Class<T2> type) {
		ContentListMessage<T2> result = new ContentListMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setItems(items);
		return result;
	}

	protected <T2> PagedContentMessage<T2> asPagedContentMessage(List<T2> items, ItemsPage page, Class<T2> type) {
		PagedContentMessage<T2> result = new PagedContentMessage<>();
		result.setRequestInfo( getRequestInfo() );
		result.setPage(page);
		result.setItems(items);
		return result;
	}
	
	protected void assertRequestBodyNotNull(Object requestBody, String errorMessage) {
		if (requestBody == null) {
			throw new BadRequestCogniveRtException(errorMessage == null? "The request body can not be empty.": errorMessage);
		}
	}
}
