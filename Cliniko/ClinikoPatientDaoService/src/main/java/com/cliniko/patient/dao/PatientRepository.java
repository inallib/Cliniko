package com.cliniko.patient.dao;

import org.springframework.data.repository.CrudRepository;

import com.cliniko.patient.model.Patient;


public interface PatientRepository extends CrudRepository<Patient, Long>{

}
