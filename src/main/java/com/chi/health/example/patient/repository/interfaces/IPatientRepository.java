package com.chi.health.example.patient.repository.interfaces;

import com.chi.health.example.patient.model.Patient;

public interface IPatientRepository {
    Patient GetPatient(Integer patientId);
}