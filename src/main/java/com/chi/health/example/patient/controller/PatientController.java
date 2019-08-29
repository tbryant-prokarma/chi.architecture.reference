package com.chi.health.example.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.chi.health.example.patient.dto.PatientDto;
import com.chi.health.example.patient.service.interfaces.IPatientService;

@Controller
public class PatientController {

    @Autowired
    private IPatientService _patientService;

    public PatientController(IPatientService patientService){
        _patientService = patientService;
    }


    @Autowired
    @GetMapping("/api/patient")
    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public PatientDto Get() {
        return _patientService.GetPatient(3);
    }
}