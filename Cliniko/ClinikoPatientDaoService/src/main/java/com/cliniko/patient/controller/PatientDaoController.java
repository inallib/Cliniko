package com.cliniko.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cliniko.patient.dao.PatientRepository;
import com.cliniko.patient.model.Patient;

@Controller
@RequestMapping("/patientdao")
public class PatientDaoController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@RequestMapping("/add") 
	public @ResponseBody String addNewPatient (@RequestParam String name
			, @RequestParam String email) {
		Patient patient = new Patient();
		patient.setName(name);
		patient.setEmail(email);
		patient.setAge("20");
		patient.setIsdCode("0091");
		patient.setPhone("9986708232");
		
		patientRepository.save(patient);
		return "saved";
	}
	
	@RequestMapping("/loadall")
	public @ResponseBody Iterable<Patient> loadAllPatient() {
		return patientRepository.findAll();
	}

}
