package com.service.result;

import com.model.searchResults.SearchResults;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ss on 19-10-2017.
 */

@Service
public class ResultWebService {


    public final RestTemplate restTemplate;

    public ResultWebService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "searchResultFailedAtFacet")
    public ResponseEntity<SearchResults> searchResult(String searchString)   {

        String url = "http://search-result-facet/searchresultfacet/fetchsearchresult/" + searchString;
        ResponseEntity<SearchResults> response = restTemplate.getForEntity(url , SearchResults.class);

        return response;
    }

    public ResponseEntity<SearchResults>  searchResultFailedAtFacet(String str) {
        return null;
    }


}
