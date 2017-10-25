package com.cliniko.searchResult.controller;

import com.cliniko.searchResult.model.Result;
import com.cliniko.searchResult.model.SearchResults;
import com.cliniko.searchResult.service.SearchResultFacetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ss on 15-10-2017.
 */
@Controller
@RequestMapping("/searchresultfacet")
public class SearchResultFacetController {

    @Autowired
    SearchResultFacetService searchResultFacetService;

    @RequestMapping(value = "/fetchsearchresult/{searchString}", method = RequestMethod.GET)
    public ResponseEntity<SearchResults> fetchSearchedResult(@PathVariable("searchString") String searchString) {
        return searchResultFacetService.prepareSearchedResult(searchString);
    }

    @RequestMapping(value = "/saveresultfacet", method = RequestMethod.POST)
    public  ResponseEntity<HttpStatus> saveResult(@RequestBody Result result ) {
        return searchResultFacetService.resultSave(result);
    }
}
