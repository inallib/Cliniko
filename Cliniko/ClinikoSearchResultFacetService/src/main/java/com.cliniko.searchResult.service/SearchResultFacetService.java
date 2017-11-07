package com.cliniko.searchResult.service;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import com.cliniko.searchResult.model.SearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * Created by ss on 16-10-2017.
 */
@Service
public class SearchResultFacetService {
    @Autowired
    private RestTemplate restTemplate;

    private Function<String,Patient> fetchPatientFunction = searchString -> {
        String url = "http://search-result-dao/searchresultdao/retrivepatientdao/" + searchString;
        ResponseEntity<Patient> response = restTemplate.getForEntity(url , Patient.class);

        return response.getBody();
    };

    private Function<String, List<Result>> fetchResultListFunction = patientId -> {
        String url = "http://search-result-dao/searchresultdao/retriveresultdao/" + patientId;

        ResponseEntity<List<Result>> response = restTemplate.exchange(url,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Result>>() {
                });

        return response.getBody();
    };

    private Function<Result, Result> prepareResultWithToDateAndPatientIdFunction = result -> {
        result.setToDate(new Date());
        result.setPatientId(result.getPatient().getId());
        return result;
    };

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public ResponseEntity<SearchResults> prepareSearchedResult(String searchString) {
        SearchResults searchResults = null;

        Optional<Patient> opPatient = Optional.ofNullable(fetchPatientFunction.apply(searchString));

        if(opPatient.isPresent()) {
            searchResults = new SearchResults();
            searchResults.setPatient(opPatient.get());
            searchResults.setResultsList(fetchResultListFunction.apply(String.valueOf(opPatient.get().getId())));
        }

        return new ResponseEntity<SearchResults>(searchResults, HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> resultSave(Result result) {
        String facetEndpoint = "http://search-result-dao/searchresultdao/saveresultdao";
        HttpEntity<Result> request = new HttpEntity<>(prepareResultWithToDateAndPatientIdFunction.apply(result));
        restTemplate.postForObject(facetEndpoint, request, Result.class);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
}
