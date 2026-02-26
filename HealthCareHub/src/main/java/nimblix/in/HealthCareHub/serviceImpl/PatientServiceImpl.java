package nimblix.in.HealthCareHub.serviceImpl;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.request.PatientRequestDTO;
import nimblix.in.HealthCareHub.response.PatientResponseDTO;
import nimblix.in.HealthCareHub.model.Patient;
import nimblix.in.HealthCareHub.repository.PatientRepository;
import nimblix.in.HealthCareHub.service.PatientService;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    public PatientResponseDTO createPatient(PatientRequestDTO requestDTO) {

        Patient patient = Patient.builder()
                .name(requestDTO.getName())
                .gender(requestDTO.getGender())
                .phone(requestDTO.getPhone())
                .age(requestDTO.getAge())
                .disease(requestDTO.getDisease())
                .build();

        Patient savedPatient = patientRepository.save(patient);

        return PatientResponseDTO.builder()
                .patientId(savedPatient.getId())
                .name(savedPatient.getName())
                .gender(savedPatient.getGender())
                .phone(savedPatient.getPhone())
                .age(savedPatient.getAge())
                .disease(savedPatient.getDisease())
                .build();
    }
}