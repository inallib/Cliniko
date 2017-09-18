package com.cliniko.patientFacet.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.cliniko.patientFacet.model.Patient;

@Service
public class PatientFacetService {

	@Autowired
	private RestTemplate restTemplate;
	
	@ResponseBody
	public String save(Patient patient) {
		return "Saved yes";
	}
	
	@ResponseBody
	public Iterable<Patient> findAll(){
		
		return null; 
	    
	}
}
