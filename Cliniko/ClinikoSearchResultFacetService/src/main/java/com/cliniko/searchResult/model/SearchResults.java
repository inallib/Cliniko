package com.cliniko.searchResult.model;

import com.cliniko.searchResult.model.Patient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ss on 15-10-2017.
 */
@Component
public class SearchResults {
    private int id;
    private Patient patient;
    private List<Result> resultsList;

    public List<Result> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<Result> resultsList) {
        this.resultsList = resultsList;
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
