package com.chi.health.example.patient.repository;

import com.chi.health.example.patient.model.Patient;
import com.chi.health.example.patient.repository.interfaces.IPatientRepository;

import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository implements IPatientRepository {

    public Patient GetPatient(Integer patientId) {
        Patient patient = new Patient();
        patient.Id = 2;
        patient.FirstName = "Service First Name";
        patient.LastName = "Service Last Name";
        return patient;
	}


}