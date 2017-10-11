package com.cliniko.patientFacet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cliniko.patientFacet.model.Patient;
import com.cliniko.patientFacet.service.PatientFacetService;

@Controller
@RequestMapping("/patientfacet")
public class PatientFacetController {

	@Autowired
	PatientFacetService patientFacetService;

	@RequestMapping(value = "/savepatientfacet", method = RequestMethod.POST)
	public  @ResponseBody String savePatient( @RequestBody Patient patient ) {
		return patientFacetService.save(patient);
	}
	
	@RequestMapping("/loadall")
	public @ResponseBody Iterable<Patient> loadAllPatient() {
		return patientFacetService.findAll();
	}
}
