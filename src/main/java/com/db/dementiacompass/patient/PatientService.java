package com.db.dementiacompass.patient;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }
    public Patient getPatientById(Long id) {
        Optional<Patient> patientOptional=  patientRepository.findById(id);
        return patientOptional.orElse(null);
    }
}
