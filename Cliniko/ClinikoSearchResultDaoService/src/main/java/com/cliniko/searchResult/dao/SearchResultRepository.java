package com.cliniko.searchResult.dao;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SearchResultRepository extends CrudRepository<Result, Long>{
    List<Result> findByPatientId(Integer patientId);

}
