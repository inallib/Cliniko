package com.controller.result;

/**
 * Created by ss on 01-10-2017.
 */

import com.model.patient.Patient;
import com.model.result.Result;
import com.model.searchResults.SearchResults;
import com.service.result.ResultWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
//@EnableCircuitBreaker
public class ResultController {

    @Autowired
    private ResultWebService resultWebService;

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showResult() {
        return "results";
    }

    @RequestMapping(value = "/searchresultweb/{searchString}", method = RequestMethod.GET)
    public ResponseEntity<SearchResults> searchResult(@PathVariable("searchString") String searchString)   {
        return resultWebService.searchResult(searchString);
    }

    @RequestMapping(value = "/saveresultweb", method = RequestMethod.POST)
    public  ResponseEntity<HttpStatus> saveResult(@RequestBody Result result )   {
        return resultWebService.saveResult(result) ;
    }
}
