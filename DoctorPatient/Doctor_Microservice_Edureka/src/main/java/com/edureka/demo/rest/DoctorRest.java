package com.edureka.demo.rest;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

@Named
@Path("/")
public class DoctorRest {

	private static long id = 1;

	@Inject
	private RestTemplate restTemplate;

	@GET
	@Path("doctor")
	@Produces(MediaType.APPLICATION_JSON)
	public Doctor submitOrder(@QueryParam("idPatient") long idPatient,
			@QueryParam("idDiagnosis") long idDiagnosis,
			@QueryParam("amount") long amount) {

		Doctor doctor = new Doctor();

		Patient patient = restTemplate.getForObject(
				"http://localhost:8091/patient?id={id}", Patient.class,
				idPatient);

		Diagnosis disease = restTemplate.getForObject(
				"http://localhost:8092/disease?id={id}", Diagnosis.class,
				idDiagnosis);

		doctor.setPatient(patient);
		doctor.setDiagnosis(disease);
		doctor.setId(id);
		doctor.setAmount(amount);
		doctor.setappointementDate(new Date());

		id++;

		return doctor;
	}
}
