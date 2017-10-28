package com.cliniko.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<HttpStatus> savePatient(@RequestBody Patient patient ) {
		patientRepository.save(patient);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping("/loadall")
	public @ResponseBody Iterable<Patient> loadAllPatient() {
		return patientRepository.findAll();
	}

}
