package com.cliniko.searchResult.controller;

import com.cliniko.searchResult.dao.SearchResultRepository;
import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/searchresultdao")
public class SearchResultDaoController {
	
	@Autowired
	private SearchResultRepository searchResultRepository;

	@RequestMapping(value = "/retrivepatientdao/{searchString}", method = RequestMethod.GET)
	public ResponseEntity<Patient> retrivePatient(@PathVariable("searchString") String searchString) {
		Patient patient = searchResultRepository.findByPhone(searchString);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveresultdao", method = RequestMethod.POST)
	public  ResponseEntity<HttpStatus> saveResult( @RequestBody Result result ) {
//		searchResultRepository.save(result);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}
