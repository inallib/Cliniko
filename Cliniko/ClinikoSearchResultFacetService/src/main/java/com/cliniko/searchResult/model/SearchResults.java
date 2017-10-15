package com.cliniko.searchResult.model;

import com.cliniko.searchResult.model.Patient;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 15-10-2017.
 */
@Component
public class SearchResults {
    private int id;
    private Patient patient;

    public SearchResults(int id, Patient patient) {
        this.id = id;
        this.patient = patient;
    }

    public SearchResults() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "SearchResults{" +
                "id=" + id +
                ", patient=" + patient +
                '}';
    }
}
