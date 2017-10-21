package com.service.patient;

import com.model.patient.Patient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import java.util.List;

/**
 * Created by ss on 24-09-2017.
 */
@Service
public class PatientWebService {

    private final RestTemplate restTemplate;

    public PatientWebService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "savePatientFailedAtFacet")
    public  @ResponseBody String savePatient(Patient patient )   {
        String facetEndpoint = "http://patient-facet/patientfacet/savepatientfacet";
        HttpEntity<Patient> request = new HttpEntity<>(patient);
        Patient patientObj = restTemplate.postForObject(facetEndpoint, request, Patient.class);
        return "Saved";
    }

    public String savePatientFailedAtFacet() {
        return "Save Patient Failed At Facet";
    }
}
