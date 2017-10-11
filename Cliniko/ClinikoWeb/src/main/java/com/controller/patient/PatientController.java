package com.controller.patient;

import com.model.patient.Patient;
import com.service.patient.PatientWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ss on 24-09-2017.
 */
@Controller
public class PatientController {

    @Autowired
    private PatientWebService patientWebService;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/loadall")
    public @ResponseBody
    Iterable<Patient> loadAllPatient() {
//        return patientWebService.findAll();
        return null;
    }

    @RequestMapping(value = "/savepatientweb", method = RequestMethod.POST)
    public  @ResponseBody String savePatient( @RequestBody Patient patient )   {
        String facetEndpoint = "http://patient-facet/patientfacet/savepatientfacet";
        HttpEntity<Patient> request = new HttpEntity<>(patient);
        Patient patientObj = restTemplate.postForObject(facetEndpoint, request, Patient.class);
        return "The company name" ;
    }

    @RequestMapping("/patient")
    public String showPatient() {
        return "patient";
    }
}
