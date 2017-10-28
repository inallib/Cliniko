package com.controller.patient;

import com.model.patient.Patient;
import com.service.patient.PatientWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

/**
 * Created by ss on 24-09-2017.
 */
@Controller
public class PatientController {

    @Autowired
    private PatientWebService patientWebService;

    @RequestMapping("/loadall")
    public @ResponseBody
    Iterable<Patient> loadAllPatient() {
//        return patientWebService.findAll();
        return null;
    }

    @RequestMapping(value = "/savepatientweb", method = RequestMethod.POST)
    public ResponseEntity<HttpStatus> savePatient(@RequestBody Patient patient )   {
        return patientWebService.savePatient(patient) ;
    }

    @RequestMapping("/patient")
    public String showPatient() {
        return "patient";
    }
}
