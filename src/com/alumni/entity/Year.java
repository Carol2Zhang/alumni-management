package com.alumni.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Year entity. @author MyEclipse Persistence Tools
 */

public class Year implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer year;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Year() {
	}

	/** full constructor */
	public Year(Integer year, Set userses) {
		this.year = year;
		this.userses = userses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}