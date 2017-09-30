package com.controller.patient;

import com.model.patient.Patient;
import com.service.patient.PatientWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ss on 24-09-2017.
 */
@Controller
public class PatientController {

    @Autowired
    private PatientWebService patientWebService;

    @RequestMapping("/loadall")
    public @ResponseBody
    Iterable<Patient> loadAllPatient() {
//        return patientWebService.findAll();
        return null;
    }

    @RequestMapping("/patient")
    public String showPatient() {
        return "patient";
    }
}
