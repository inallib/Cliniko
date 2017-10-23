package com.cliniko.searchResult.dao;

import com.cliniko.searchResult.model.Patient;
import com.cliniko.searchResult.model.Result;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ss on 23-10-2017.
 */

public interface SaveResultRepository extends CrudRepository<Result, Long> {

}
