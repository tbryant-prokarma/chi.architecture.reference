package com.chi.health.example.patient.mapper;

import com.chi.health.example.patient.dto.PatientDto;
import com.chi.health.example.patient.model.Patient;

public class PatientMapper {
    public static PatientDto toPatientDto(Patient patient){

        PatientDto patientDto = new PatientDto();

        patientDto.Id = patient.Id;
        patientDto.FirstName = patient.FirstName + "FromDTO";
        patientDto.LastName = patient.LastName + "FromDTO";

        return patientDto;
    }
}