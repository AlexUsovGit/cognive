package com.cognive.storage.app.rdbms.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cognive.core.exception.IllegalArgumentCogniveRtException;
import com.cognive.core.exception.NotFoundCogniveRtException;
import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.model.base.ItemsPage;
import com.cognive.core.model.base.ModifiableBoFilter;
import com.cognive.core.service.base.BaseBoCrudService;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableBoMapper;
import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

abstract public class BaseServicePg<T extends BaseModifiableBusinessObject, E extends BaseModifiableEntity> implements BaseBoCrudService<T> {

	protected static final String CREATED_ON = "createdOn";
	protected static final String DEFAULT_SORT_FIELD = CREATED_ON;
	protected static final int DEFAULT_PAGE_SIZE = 25;
	protected static final String INCORRECT_ID_ERROR = null;

	private static final Logger logger = LoggerFactory.getLogger(BaseServicePg.class);
	
	abstract protected BaseModifiableBoMapper<T, E> getMapper();
	
	abstract protected PagingAndSortingRepository<E, Long> getRepo();

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#create(T)
	 */
	@Override
	public T create(T bo) {
		// bo.setId(0);
		// Optional<T> existed = getRepo().findById(bo.getId());
		E e = getMapper().boToEntity(bo);
		e = getRepo().save(e);
		return getMapper().entityToBo(e);
	}

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#getById(java.lang.Long)
	 */
	@Override
	public T getById(Long id) {
		E e = getEntityById(id);
		return getMapper().entityToBo(e);
	}

	protected E getEntityById(Long id) {
		assertValidId(id, "ID is not valid for the getById operation.");
		Optional<E> e = getRepo().findById(id);
		if (!e.isPresent()) {
			throw new NotFoundCogniveRtException("T was not found for id=" + id);
		}
		return e.get();
	}

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#find(com.cognive.core.model.base.ModifiableBoFilter)
	 */
	@Override
	public List<T> find(ModifiableBoFilter filter) {
		Iterable<E> items = getRepo().findAll(asPageRequest(filter));
		return getMapper().entitiesToBoList(items);
	}

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#update(T)
	 */
	@Override
	public T update(T bo) {
		E e = getEntityById(bo.getId());
		getMapper().updateEntity(getMapper().boToEntity(bo), e);
		prepareToUpdate(e);
		e = getRepo().save(e);
		return getMapper().entityToBo(e);
	}

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#delete(long)
	 */
	@Override
	public void delete(long id) {
		assertValidId(id, "ID is not valid for the delete operation.");
		getRepo().deleteById(id);
	}
	
	protected void prepareToCreate(T arg) {
		arg.setCreatedOn(new Date());
		arg.setCreatedBy( getCurrentUser() );
	}

	protected void prepareToUpdate(E arg) {
		arg.setModifiedOn(new Date());
		arg.setModifiedBy( getCurrentUser() );
	}

	protected String getCurrentUser() {
		// FIXME:
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

	protected void assertValidId(Long arg, String msg) {
		if (arg == null) {
			throw new IllegalArgumentCogniveRtException(msg == null ? INCORRECT_ID_ERROR : msg);
		}
	}

	protected void assertValidId(String arg, String msg) {
		if (arg == null || arg.trim().isEmpty()) {
			throw new IllegalArgumentCogniveRtException(msg == null ? INCORRECT_ID_ERROR : msg);
		}
	}

	protected void assertFoundItemNotNull(Object arg, String msg) {
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
