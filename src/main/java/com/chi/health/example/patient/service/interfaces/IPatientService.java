package com.chi.health.example.patient.service.interfaces;

import com.chi.health.example.patient.dto.PatientDto;

public interface IPatientService {
    PatientDto GetPatient(Integer patientId);
}