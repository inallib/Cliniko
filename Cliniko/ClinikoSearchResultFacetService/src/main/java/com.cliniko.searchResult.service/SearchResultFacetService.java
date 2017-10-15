package com.cliniko.searchResult.service;

import com.cliniko.searchResult.model.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
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
        return null;
    }
}
