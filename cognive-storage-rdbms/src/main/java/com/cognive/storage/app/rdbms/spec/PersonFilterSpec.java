package com.cognive.storage.app.rdbms.spec;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
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
		
		addLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.firstName), filter.getFirstName());
		addLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.middleName), filter.getMiddleName());
		addLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.lastName), filter.getLastName());
		
		addLikeCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.birthPlace), filter.getBirthPlace());
		addSameDayCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.birthDate), filter.getBirthDate());
		
		addEqualCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.socialSecurityNumber), filter.getSocialSecurityNumber());
		addEqualCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.taxIdentificationNumber), filter.getTaxIdentificationNumber());
		
		// addEqualCondition(criteriaBuilder, restrictions, root.get(PersonEntity_.birthPlace), filter.getAccountNumber());
		
		if (restrictions.isEmpty()) {
			return null;
		} else {
			return criteriaBuilder.and(restrictions.toArray(new Predicate[restrictions.size()]));
		}
	}

	protected void addLikeCondition(CriteriaBuilder criteriaBuilder, final List<Predicate> restrictions,
			 Expression<String> field, String value) {
		
		if (! StringUtils.isEmpty(value)) {
			restrictions.add( criteriaBuilder.like(field, "%" + value + "%") );
		}
	}

	protected void addStartWithCondition(CriteriaBuilder criteriaBuilder, final List<Predicate> restrictions,
			 Expression<String> field, String value) {
		
		if (! StringUtils.isEmpty(value)) {
			restrictions.add( criteriaBuilder.like(field, "%" + value) );
		}
	}

	protected void addEqualCondition(CriteriaBuilder criteriaBuilder, final List<Predicate> restrictions,
			 Expression<String> field, String value) {
		
		if (! StringUtils.isEmpty(value)) {
			restrictions.add( criteriaBuilder.equal(field, value) );
		}
	}

	protected void addSameDayCondition(CriteriaBuilder criteriaBuilder, final List<Predicate> restrictions,
			 Expression<Date> field, Date value) {
		
		// TODO: rework with java.time
		
		if (! StringUtils.isEmpty(value)) {
			Calendar c = Calendar.getInstance();
			c.setTime(value);
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MILLISECOND, 0);
			
			Date dayBegin = c.getTime();
			c.add(Calendar.HOUR_OF_DAY, 24);
			restrictions.add( criteriaBuilder.<Date>between(field, dayBegin, c.getTime()) );
		}
	}

}
