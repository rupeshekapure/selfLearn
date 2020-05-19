package com.edureka.demo.rest;

public class Diagnosis {

	private long id;

	private String disease_name;

	private String disease_description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return disease_name;
	}

	public void setName(String disease_name) {
		this.disease_name = disease_name;
	}

	public String getDescription() {
		return disease_description;
	}

	public void setDescription(String disease_description) {
		this.disease_description = disease_description;
	}
}