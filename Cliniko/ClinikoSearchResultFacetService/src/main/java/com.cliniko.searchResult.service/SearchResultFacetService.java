package com.cliniko.searchResult.service;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import com.cliniko.searchResult.model.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by ss on 16-10-2017.
 */
@Service
public class SearchResultFacetService {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    public ResponseEntity<SearchResults> prepareSearchedResult(String searchString) {

        String url = "http://search-result-dao/searchresultdao/retrivepatientdao/" + searchString;
        ResponseEntity<Patient> response = restTemplate.getForEntity(url , Patient.class);

        SearchResults searchResults = new SearchResults();
        searchResults.setPatient(response.getBody());

        return new ResponseEntity<SearchResults>(searchResults, HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> resultSave(Result result) {
        String facetEndpoint = "http://search-result-dao/searchresultdao/saveresultdao";
        HttpEntity<Result> request = new HttpEntity<>(prepareResultWithToDateAndPatientId(result));
        restTemplate.postForObject(facetEndpoint, request, Result.class);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    private Result prepareResultWithToDateAndPatientId(Result result){
        Date toDate = new Date();
        result.setToDate(toDate);
        result.setPatientId(result.getPatient().getId());
        return result;
    }
}
