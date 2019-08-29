package com.chi.health.example.patient.configuration;

import com.chi.health.example.patient.repository.PatientRepository;
import com.chi.health.example.patient.repository.interfaces.IPatientRepository;
import com.chi.health.example.patient.service.PatientService;
import com.chi.health.example.patient.service.interfaces.IPatientService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PatientConfiguration {
 
    @Bean
    @Primary
    @ConditionalOnProperty(name = "useAlternate", havingValue = "false", matchIfMissing = true)
    public IPatientService PatientService() {
        return new PatientService();
    }
 
    @Bean
    public IPatientRepository PatientRepository(){
        return new PatientRepository();
    }
}