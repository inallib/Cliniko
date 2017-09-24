package com.cliniko.patientFacet.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import java.util.List;


import com.cliniko.patientFacet.model.Patient;

@Service
public class PatientFacetService {

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@ResponseBody
	public String save(Patient patient) {
		ResponseEntity<List<Patient>> exchange =
				this.restTemplate.exchange(
						"http://patient-dao/patientdao/add",
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<Patient>>() {
						},
						(Object) "mstine");
		return "Saved yes";
	}
	
	@ResponseBody
	public Iterable<Patient> findAll(){

		ResponseEntity<List<Patient>> exchange =
				this.restTemplate.exchange(
						"http://patient-dao/patientdao/loadall",
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<Patient>>() {
						},
						(Object) "mstine");

		return exchange.getBody();
	    
	}
}
