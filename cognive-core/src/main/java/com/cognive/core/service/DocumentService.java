package com.cognive.core.service;

import java.util.List;

import com.cognive.core.model.base.ItemsPage;
import com.cognive.core.model.common.Document;
import com.cognive.core.service.base.BaseBoCrudService;

public interface DocumentService extends BaseBoCrudService<Document> {

	List<Document> findPersonId(long personId, ItemsPage page);

}
