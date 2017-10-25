package com.cliniko.searchResult.controller;

import com.cliniko.searchResult.dao.SaveResultRepository;
import com.cliniko.searchResult.dao.SearchPatientRepository;
import com.cliniko.searchResult.dao.SearchResultRepository;
import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/searchresultdao")
public class SearchResultDaoController {
	
	@Autowired
	private SearchResultRepository searchResultRepository;

	@Autowired
	private SaveResultRepository saveResultRepository;

	@Autowired
	private SearchPatientRepository searchPatientRepository;

	@RequestMapping(value = "/retriveresultdao/{searchString}", method = RequestMethod.GET)
	public ResponseEntity<List<Result>> retriveSearchResult(@PathVariable("searchString") String searchString) {
		List<Result> searchResults = searchResultRepository.findByPatientId(Integer.parseInt(searchString));
		return new ResponseEntity<List<Result>>(searchResults, HttpStatus.OK);
	}

	@RequestMapping(value = "/retrivepatientdao/{searchString}", method = RequestMethod.GET)
	public ResponseEntity<Patient> retrivePatient(@PathVariable("searchString") String searchString) {
		Patient patient = searchPatientRepository.findByPhone(searchString);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveresultdao", method = RequestMethod.POST)
	public  ResponseEntity<HttpStatus> saveResult( @RequestBody Result result ) {
		saveResultRepository.save(result);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}
