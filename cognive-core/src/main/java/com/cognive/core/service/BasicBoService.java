package com.cognive.core.service;

import java.util.List;

import com.cognive.core.model.BasicBo;
import com.cognive.core.model.BasicBoFilter;

public interface BasicBoService {

	BasicBo create(BasicBo bo);
	
	BasicBo getById(String id);
	
	List<BasicBo> find(BasicBoFilter filter);
	
	BasicBo update(BasicBo bo);
	
	void delete(String id);
	
}
