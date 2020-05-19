package com.edureka.demo;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("com.edureka.demo.rest");
		}
	}

}