package com.edureka.demo.rest;

public class Patient {

	private long id;

	private String patient_name;

	private String patient_emailid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return patient_name;
	}

	public void setName(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getEmail() {
		return patient_emailid;
	}

	public void setEmail(String patient_emailid) {
		this.patient_emailid = patient_emailid;
	}

}
