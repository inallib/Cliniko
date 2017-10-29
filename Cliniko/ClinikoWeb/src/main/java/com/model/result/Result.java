package com.model.result;

import com.model.patient.Patient;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by ss on 22-10-2017.
 */
@Component
public class Result {
    private String id;
    private Integer patientId;

    @NotNull
    private String testName;

    @NotNull
    private String normalRange;

    @NotNull
    private String result;

    @NotNull
    private String remarks;
    private Date toDate;
    private Patient patient;

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(String normalRange) {
        this.normalRange = normalRange;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
