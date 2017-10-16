package com.cliniko.searchResult.dao;

import com.cliniko.searchResult.model.Patient;
import org.springframework.data.repository.CrudRepository;


public interface SearchResultRepository extends CrudRepository<Patient, Long>{
    Patient findByPhone(String phone);
}
