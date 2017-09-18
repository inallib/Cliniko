package com.cliniko.patientFacet.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cliniko.patientFacet.model.Patient;

@Service
public class PatientFacetService {

	@ResponseBody
	public String save(Patient patient) {
		return "Saved yes";
	}
	
	public @ResponseBody Iterable<Patient> findAll(){
		return null;
	}
}
