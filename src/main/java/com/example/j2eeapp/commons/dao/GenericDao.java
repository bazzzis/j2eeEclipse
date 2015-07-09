package com.example.j2eeapp.commons.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Generic Interface for Data objects. To be extendede or implemented
 * Contains Common persistance methods
 * @author bazzis
 *
 */

public interface GenericDao <T, ID extends Serializable>{
	
	T save(T entity);
	T update(T entity);
	void delete(T entity);
	T findById(ID id);
	List<T> findAll();
	 void flush();
	

	

}
