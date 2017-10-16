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

        return response;
    }
}
