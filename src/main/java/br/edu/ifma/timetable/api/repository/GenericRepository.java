package br.edu.ifma.timetable.api.repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public abstract class GenericRepository<T> {
	
	@PersistenceContext
	protected EntityManager manager;
	
	private Class<T> clazz;
	
	public GenericRepository() {
		
	}
	
	public GenericRepository(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		
		CriteriaQuery<Object> criteria = manager.getCriteriaBuilder().createQuery();
		criteria.select(criteria.from(clazz));
		
		return (List<T>) manager.createQuery(criteria).getResultList();
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private Class<T> retornaTipo() {
	    Class<?> clazz = this.getClass();
	     
	    while (!clazz.getSuperclass().equals(GenericRepository.class)) {
	        clazz = clazz.getSuperclass();
	    }
	     
	    ParameterizedType tipoGenerico = (ParameterizedType) clazz.getGenericSuperclass();
	    return (Class<T>) tipoGenerico.getActualTypeArguments()[0];
    }
}
