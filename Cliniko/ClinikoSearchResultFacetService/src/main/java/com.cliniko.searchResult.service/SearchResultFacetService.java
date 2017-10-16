package com.cliniko.searchResult.service;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
}
