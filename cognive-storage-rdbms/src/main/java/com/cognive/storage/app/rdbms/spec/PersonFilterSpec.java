package com.cognive.storage.app.rdbms.spec;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.cognive.core.model.filter.PersonSearchFilter;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity;
import com.cognive.storage.app.rdbms.entity.common.PersonEntity_;

public class PersonFilterSpec implements Specification<PersonEntity> {

	private static final long serialVersionUID = 2404431625987370329L;
	
	final private PersonSearchFilter filter;
	
	public PersonFilterSpec(PersonSearchFilter filter) {
		this.filter = filter;
	}
	
	@Override
	public Predicate toPredicate(Root<PersonEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		if (filter == null) {
			return null;
		}
		
		//criteriaBuilder.or(restrictions)
		final List<Predicate> restrictions = new LinkedList<>();
		
		makeLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.firstName), filter.getFirstName());
		makeLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.middleName), filter.getMiddleName());
		makeLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.lastName), filter.getLastName());
		
		if (restrictions.isEmpty()) {
			return null;
		} else {
			return criteriaBuilder.or(restrictions.toArray(new Predicate[restrictions.size()]));
		}
	}

	private void makeLikeCondition(CriteriaBuilder criteriaBuilder, final List<Predicate> restrictions,
			 Expression<String> field, String value) {
		
		if (! StringUtils.isEmpty(filter.getFirstName())) {
			restrictions.add( criteriaBuilder.like(field, value) );
		}
	}

}
