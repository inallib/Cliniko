package com.cliniko.searchResult.dao;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ss on 25-10-2017.
 */
public interface SearchPatientRepository extends CrudRepository<Patient, Long> {
    Patient findByPhone(String phoneNo);
}
