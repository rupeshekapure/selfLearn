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
public class PatientRest {

	private static List<Patient> clients = new ArrayList<Patient>();

	static {

		Patient patient1 = new Patient();
		patient1.setId(001);
		patient1.setName("Joey");
		patient1.setEmail("patient1@edureka.co");

		Patient patient2 = new Patient();
	    patient2.setId(002);
		patient2.setName("Rachel");
		patient2.setEmail("patient2@edureka.co");

		Patient patient3 = new Patient();
		patient3.setId(003);
		patient3.setName("Phoebe");
		patient3.setEmail("patient3@edureka.co");

		Patient patient4 = new Patient();
		patient4.setId(004);
		patient4.setName("Chandler");
		patient4.setEmail("patient4@edureka.co");

		Patient patient5 = new Patient();
		patient5.setId(005);
		patient5.setName("Ross");
		patient5.setEmail("patient5@edureka.co");

		Patient patient6 = new Patient();
		patient6.setId(006);
		patient6.setName("Monica");
		patient6.setEmail("patient6@edureka.co");

		clients.add(patient1);
		clients.add(patient2);
		clients.add(patient3);
		clients.add(patient4);
		clients.add(patient5);
		clients.add(patient6);

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Patient> getClientes() {
		return clients;
	}

	@GET
	@Path("patient")
	@Produces(MediaType.APPLICATION_JSON)
	public Patient getCliente(@QueryParam("id") long id) {

		Patient cli = null;

		for (Patient c : clients) {

			if (c.getId() == id)
				cli = c;

		}

		return cli;
	}

}
