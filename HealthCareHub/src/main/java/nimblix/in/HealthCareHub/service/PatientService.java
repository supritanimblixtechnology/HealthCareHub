package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.request.PatientRequestDTO;
import nimblix.in.HealthCareHub.response.PatientResponseDTO;

public interface PatientService {
    PatientResponseDTO createPatient(PatientRequestDTO requestDTO);
}