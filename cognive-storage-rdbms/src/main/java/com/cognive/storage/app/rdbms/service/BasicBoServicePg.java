package com.cognive.storage.app.rdbms.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cognive.core.exception.IllegalArgumentCogniveRtException;
import com.cognive.core.exception.NotFoundCogniveRtException;
import com.cognive.core.model.BasicBo;
import com.cognive.core.model.BasicBoFilter;
import com.cognive.core.model.base.ItemsPage;
import com.cognive.core.service.BasicBoService;
import com.cognive.storage.app.rdbms.entity.BasicEntity;
import com.cognive.storage.app.rdbms.mapper.BasicBoMapper;
import com.cognive.storage.app.rdbms.repo.BasicEntityRepo;

@Service
public class BasicBoServicePg implements BasicBoService {

	private static final String CREATED_ON = "createdOn";
	private static final String DEFAULT_SORT_FIELD = CREATED_ON;
	private static final int DEFAULT_PAGE_SIZE = 25;
	private static final String INCORRECT_ID_ERROR = null;

	@Autowired
	BasicEntityRepo repo;

	@Autowired
	BasicBoMapper mapper;

	@Override
	public BasicBo create(BasicBo bo) {
		BasicEntity e = mapper.boToEntity(bo);
		e = repo.save(e);
		return mapper.entityToBo(e);
	}

	@Override
	public BasicBo getById(String id) {
		BasicEntity e = getEntityById(id);
		return mapper.entityToBo(e);
	}

	protected BasicEntity getEntityById(String id) {
		assertValidId(id, "ID is not valid for the getById operation.");
		Optional<BasicEntity> e = repo.findById(id);
		if (!e.isPresent()) {
			throw new NotFoundCogniveRtException("BasicBo was not found for id=" + id);
		}
		return e.get();
	}

	@Override
	public List<BasicBo> find(BasicBoFilter filter) {
		Iterable<BasicEntity> items = repo.findAll(asPageRequest(filter));
		return mapper.entitiesToBoList(items);
	}

	@Override
	public BasicBo update(BasicBo bo) {
		BasicEntity e = getEntityById(bo.getId());
		mapper.updateEntity(mapper.boToEntity(bo), e);
		prepareToUpdate(e);
		e = repo.save(e);
		return mapper.entityToBo(e);
	}

	@Override
	public void delete(String id) {
		assertValidId(id, "ID is not valid for the delete operation.");
		repo.deleteById(id);
	}
	
	protected void prepareToCreate(BasicEntity arg) {
		arg.setCreatedOn(new Date());
		arg.setCreatedBy( getCurrentUser() );
	}

	protected void prepareToUpdate(BasicEntity arg) {
		arg.setModifiedOn(new Date());
		arg.setModifiedBy( getCurrentUser() );
	}

	protected String getCurrentUser() {
		return "stub-user";
	}

	protected Pageable asPageRequest(int page, int size) {
		return asPageRequest(page, size, true);
	}

	protected Pageable asPageRequest(int page, int size, boolean isDesc) {
		return PageRequest.of(page, validatePageSize(size), isDesc ? Direction.DESC : Direction.ASC, CREATED_ON);
	}

	protected int validatePageSize(int size) {
		return (size <= 0) ? DEFAULT_PAGE_SIZE : size;
	}

	protected void assertValidId(String arg, String msg) {
		if (arg == null || arg.trim().isEmpty()) {
			throw new IllegalArgumentCogniveRtException(msg == null ? INCORRECT_ID_ERROR : msg);
		}
	}

	protected void assertNotNull(Object arg, String msg) {
		if (arg == null) {
			throw new NotFoundCogniveRtException(msg);
		}
	}

	protected void rejectNullArgument(Object parameterValue, String errorMessage) {
		if (parameterValue == null || "".equals(parameterValue.toString())) {
			throw new IllegalArgumentCogniveRtException(errorMessage);
		}
	}

	protected void rejectNullResult(Object parameterValue, String errorMessage) {
		if (parameterValue == null || "".equals(parameterValue.toString())) {
			throw new NotFoundCogniveRtException(errorMessage);
		}
	}

	protected Pageable asPageRequest(ItemsPage page) {
		return PageRequest.of(
				page.getPage(), 
				validatePageSize(page.getSize()), 
				page.isAsc()? Direction.ASC: Direction.DESC, 
				page.getSortBy() == null? CREATED_ON: page.getSortBy());
	}
}
