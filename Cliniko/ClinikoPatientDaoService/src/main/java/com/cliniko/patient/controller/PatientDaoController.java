package com.cliniko.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cliniko.patient.dao.PatientRepository;
import com.cliniko.patient.model.Patient;

@Controller
@RequestMapping("/patientdao")
public class PatientDaoController {
	
	@Autowired
	private PatientRepository patientRepository;

	@RequestMapping(value = "/savepatientdao", method = RequestMethod.POST)
	public  @ResponseBody String savePatient( @RequestBody Patient patient ) {
		patientRepository.save(patient);
		return "saved";
	}
	
	@RequestMapping("/loadall")
	public @ResponseBody Iterable<Patient> loadAllPatient() {
		return patientRepository.findAll();
	}

}
