package nimblix.in.HealthCareHub.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRequest {

    private String name;
    private String gender;
    private String phone;
    private int age;
    private String disease;
}
