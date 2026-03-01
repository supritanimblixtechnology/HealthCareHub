package nimblix.in.HealthCareHub.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientResponse {

    private Long patientId;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String disease;
    private int age;
}
