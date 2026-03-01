package nimblix.in.HealthCareHub.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import nimblix.in.HealthCareHub.request.PatientRequest;
import nimblix.in.HealthCareHub.response.PatientResponse;
import nimblix.in.HealthCareHub.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PatientResponse createPatient(
            @Valid @RequestBody PatientRequest requestDTO) {

        return patientService.createPatient(requestDTO);
    }
}