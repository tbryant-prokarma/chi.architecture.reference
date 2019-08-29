package com.chi.health.example.patient.service;

import com.chi.health.example.patient.dto.PatientDto;
import com.chi.health.example.patient.mapper.PatientMapper;
import com.chi.health.example.patient.model.Patient;
import com.chi.health.example.patient.service.interfaces.IPatientService;

public class AlternatePatientService implements IPatientService{
    public PatientDto GetPatient(Integer patientId){
        
        Patient repositoryPatient = new Patient();

        PatientDto dtoPatient = PatientMapper.toPatientDto(repositoryPatient);
        dtoPatient.Id = 99;
        dtoPatient.FirstName = "Alternate First Name";
        dtoPatient.LastName = "Alternate Last Name";
        return dtoPatient;
    }
}