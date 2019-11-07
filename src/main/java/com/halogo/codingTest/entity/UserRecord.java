/**
 * 
 */
package com.halogo.codingTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Aditya
 *
 */
@Entity
public class UserRecord {

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numberValue
	 */
	public String getNumberValue() {
		return numberValue;
	}

	/**
	 * @param numberValue the numberValue to set
	 */
	public void setNumberValue(String numberValue) {
		this.numberValue = numberValue;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
	
	private String numberValue;

}
