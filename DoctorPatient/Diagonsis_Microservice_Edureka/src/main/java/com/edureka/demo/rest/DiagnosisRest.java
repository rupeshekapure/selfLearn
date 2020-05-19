package com.edureka.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class DiagnosisRest {

	private static List<Diagnosis> diseases = new ArrayList<Diagnosis>();

	static {

		Diagnosis disease1 = new Diagnosis();
		disease1.setId(001);
		disease1.setName("Viral Fever");
		disease1.setDescription("Caused by viruses are among the most frequent causes of fever in adults. Common symptoms can include a runny nose, sore throat, cough, hoarseness, and muscle aches.");

		Diagnosis disease2 = new Diagnosis();
		disease2.setId(2);
		disease2.setName("Pneumonia");
		disease2.setDescription("Symptoms include a cough with phlegm or pus, fever, chills and difficulty breathing.");

		Diagnosis disease3 = new Diagnosis();
		disease3.setId(3);
		disease3.setName("Malaria");
		disease3.setDescription("Symptoms are chills, fever and sweating, usually occurring a few weeks after being bitten.");

		Diagnosis disease4 = new Diagnosis();
		disease4.setId(4);
		disease4.setName("Typhoid");
		disease4.setDescription("Symptoms include high fever, headache, stomach pain, weakness, vomiting and loose stools.");

		diseases.add(disease1);
		diseases.add(disease2);
		diseases.add(disease3);
		diseases.add(disease4);

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Diagnosis> getDiagnosis() {
		return diseases;
	}

	@GET
	@Path("disease")
	@Produces(MediaType.APPLICATION_JSON)
	public Diagnosis getDiagnosis(@QueryParam("id") long id) {

		Diagnosis disea = null;

		for (Diagnosis d : diseases) {

			if (d.getId() == id)
				disea = d;

		}

		return disea;
	}

}
