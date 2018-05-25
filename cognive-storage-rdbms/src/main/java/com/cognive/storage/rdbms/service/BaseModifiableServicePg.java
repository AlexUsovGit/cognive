package com.cognive.storage.rdbms.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cognive.core.model.base.BaseModifiableBusinessObject;
import com.cognive.core.model.base.ModifiableBoFilter;
import com.cognive.core.service.base.BaseModifiableBoCrudService;
import com.cognive.storage.app.rdbms.mapper.BaseModifiableEntityMapper;
import com.cognive.storage.rdbms.entity.BaseModifiableEntity;

abstract public class BaseModifiableServicePg<T extends BaseModifiableBusinessObject, E extends BaseModifiableEntity>
	extends BaseServicePg<T, E>
	implements BaseModifiableBoCrudService<T> {

	protected static final String CREATED_ON = "createdOn";
	protected static final String DEFAULT_SORT_FIELD = CREATED_ON;
	protected static final int DEFAULT_PAGE_SIZE = 25;
	protected static final String INCORRECT_ID_ERROR = null;

	private static final Logger logger = LoggerFactory.getLogger(BaseModifiableServicePg.class);
	
	abstract protected BaseModifiableEntityMapper<T, E> getMapper();
	
	abstract protected PagingAndSortingRepository<E, Long> getRepo();

	@Override
	public List<T> find(ModifiableBoFilter filter) {
		Page<E> items = getRepo().findAll(asPageRequest(filter));
		filter.setTotal( items.getTotalElements() );
		return getMapper().entitiesToBoList(items.getContent());
	}

	/* (non-Javadoc)
	 * @see com.cognive.storage.app.rdbms.service.BaseBoCrudService#update(T)
	 */
	@Override
	public T update(T bo) {
		E e = getEntityById(bo.getId());
		getMapper().updateAsModifiableEntity(getMapper().boToEntity(bo), e);
		prepareToUpdate(e);
		e = getRepo().save(e);
		return getMapper().entityToBo(e);
	}

	protected void prepareToUpdate(E arg) {
		arg.setModifiedOn(new Date());
		arg.setModifiedBy( getCurrentUser() );
	}

}
