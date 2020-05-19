package com.edureka.demo.rest;

import java.util.Date;

import com.edureka.demo.rest.Patient;
import com.edureka.demo.rest.Diagnosis;

public class Doctor {

	private long id;

	private long amount;

	private Date appointementDate;

	private Patient patient;

	private Diagnosis disease;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getappointementDate() {
		return appointementDate;
	}

	public void setappointementDate(Date appointementDate) {
		this.appointementDate = appointementDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Diagnosis getDiagnosis() {
		return disease;
	}

	public void setDiagnosis(Diagnosis disease) {
		this.disease = disease;
	}


	

}
