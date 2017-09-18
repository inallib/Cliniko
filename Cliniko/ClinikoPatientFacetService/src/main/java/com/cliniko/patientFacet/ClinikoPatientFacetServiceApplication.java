package com.cliniko.patientFacet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClinikoPatientFacetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinikoPatientFacetServiceApplication.class, args);
	}
}
