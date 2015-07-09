package com.example.j2eeapp.commons.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *This Entity type to hold domain id property. To be extended.
 * @author bazzis
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = -2435150907688878077L;

	

@Id
@GeneratedValue
private Long id;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


}
