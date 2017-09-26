package com.service.patient;

import com.model.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import java.util.List;

/**
 * Created by ss on 24-09-2017.
 */
@Service
public class PatientWebService {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }
//
//    @ResponseBody
//    public Iterable<Patient> findAll(){
//
//        ResponseEntity<List<Patient>> exchange =
//                this.restTemplate.exchange(
//                        "http://patient-facet/patientfacet/loadall",
//                        HttpMethod.GET,
//                        null,
//                        new ParameterizedTypeReference<List<Patient>>() {
//                        },
//                        (Object) "mstine");
//
//        return exchange.getBody();
//
//    }
}
