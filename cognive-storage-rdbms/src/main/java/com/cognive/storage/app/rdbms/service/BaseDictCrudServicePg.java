package com.cognive.storage.app.rdbms.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;

import com.cognive.core.CogniveApplication;
import com.cognive.core.exception.IllegalArgumentCogniveRtException;
import com.cognive.core.exception.NotFoundCogniveRtException;
import com.cognive.core.model.base.BaseDictItem;
import com.cognive.core.service.BaseDictCrudService;
import com.cognive.storage.app.rdbms.mapper.BaseDictItemMapper;
import com.cognive.storage.rdbms.entity.BaseDictEntity;

public abstract class BaseDictCrudServicePg<BO extends BaseDictItem, E extends BaseDictEntity> implements BaseDictCrudService<BO, String> {

	private static final Logger logger = LoggerFactory.getLogger(CogniveApplication.class);
	
	abstract BaseDictItemMapper<BO, E> getMapper();
	
	abstract CrudRepository<E, String> getRepo();
	
	@Override
	public BO create(BO item) {
		E e = getMapper().boToEntity(item);
		e = getRepo().save( e );
		return getMapper().entityToBo( e );
	}

	@Override
	public Collection<BO> save(Collection<BO> items) {
		Iterable<E> e = getMapper().bosToEntitiesList(items);
		e = getRepo().saveAll( e );
		return getMapper().entitiesToBoList( e );
	}

	@Override
	public BO getById(String id) {
		return getMapper().entityToBo( getEntityById(id) );
	}

	private E getEntityById(String id) {
		Optional<E> e = getRepo().findById(id);
		if (!e.isPresent()) {
			throw new NotFoundCogniveRtException("Dictionary item was not found for ID=" + id);
		} else {
			return e.get();
		}
	}

	@Override
	public List<BO> findAll() {
		Iterable<E> e = getRepo().findAll();
		return getMapper().entitiesToBoList( e );
	}

	@Override
	public BO update(BO item) {
		E e = getEntityById(item.getCode());
		getMapper().updateEntity(getMapper().boToEntity(item), e);
		e = getRepo().save(e);
		return getMapper().entityToBo(e);
	}

	@Override
	public void delete(String id) {
		if (id == null || id.length() == 0) {
			throw new IllegalArgumentCogniveRtException("Dictionary item ID is not defined.");
		}
		getRepo().deleteById(id);
	}
	
}
