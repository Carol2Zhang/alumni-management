package com.alumni.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Industry entity. @author MyEclipse Persistence Tools
 */

public class Industry implements java.io.Serializable {

	// Fields

	private Integer id;
	private String industryName;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Industry() {
	}

	/** full constructor */
	public Industry(String industryName, Set userses) {
		this.industryName = industryName;
		this.userses = userses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}