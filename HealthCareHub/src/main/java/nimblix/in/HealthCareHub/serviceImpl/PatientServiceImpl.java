package nimblix.in.HealthCareHub.serviceImpl;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.request.PatientRequest;
import nimblix.in.HealthCareHub.response.PatientResponse;
import nimblix.in.HealthCareHub.model.Patient;
import nimblix.in.HealthCareHub.repository.PatientRepository;
import nimblix.in.HealthCareHub.service.PatientService;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    public PatientResponse createPatient(PatientRequest requestDTO) {

        Patient patient = Patient.builder()
                .name(requestDTO.getName())
                .gender(requestDTO.getGender())
                .phone(requestDTO.getPhone())
                .age(requestDTO.getAge())
                .disease(requestDTO.getDisease())
                .build();

        Patient savedPatient = patientRepository.save(patient);

        return PatientResponse.builder()
                .patientId(savedPatient.getId())
                .name(savedPatient.getName())
                .gender(savedPatient.getGender())
                .phone(savedPatient.getPhone())
                .age(savedPatient.getAge())
                .disease(savedPatient.getDisease())
                .build();
    }
}