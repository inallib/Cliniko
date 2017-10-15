package com.controller.result;

/**
 * Created by ss on 01-10-2017.
 */

import com.model.patient.Patient;
import com.model.searchResults.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class ResultController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showResult() {
        return "results";
    }

    @RequestMapping(value = "/searchresultweb/{searchString}", method = RequestMethod.GET)
    public ResponseEntity<SearchResults> searchResult(@PathVariable("searchString") String searchString)   {

        String url = "http://search-result-facet/searchresultfacet/fetchsearchresult/" + searchString;
        ResponseEntity<SearchResults> response = restTemplate.getForEntity(url , SearchResults.class);

//        String facetEndpoint = "http://search-result-facet/searchresultfacet/savepatientfacet";
//        HttpEntity<String> request = new HttpEntity<>(searchString);
//        SearchResults searchResults = restTemplate.postForObject(facetEndpoint, request, Patient.class);



//        Patient patient = new Patient();
//        patient.setName("saurav");
//
//        SearchResults searchResults = new SearchResults();
//        searchResults.setId(0);
//        searchResults.setPatient(patient);
        return response;
//        return new ResponseEntity<SearchResults>(searchResults, null, HttpStatus.CREATED);
    }
}
