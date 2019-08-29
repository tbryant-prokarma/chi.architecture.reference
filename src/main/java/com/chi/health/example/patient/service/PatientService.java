package com.chi.health.example.patient.service;

import com.chi.health.example.patient.dto.PatientDto;
import com.chi.health.example.patient.mapper.PatientMapper;
import com.chi.health.example.patient.model.Patient;
import com.chi.health.example.patient.service.interfaces.IPatientService;

public class PatientService implements IPatientService{
    public PatientDto GetPatient(Integer patientId){
        
        Patient repositoryPatient = new Patient();
        repositoryPatient.Id = patientId;
        repositoryPatient.FirstName = "First Name " + patientId;
        repositoryPatient.LastName = "Last Name " + patientId;
        PatientDto dtoPatient = PatientMapper.toPatientDto(repositoryPatient);

        return dtoPatient;
    }
}