package nimblix.in.HealthCareHub.request;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRequestDTO {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "gender is required")
    private String gender;

    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;

    @Min(0)
    @Max(120)
    private int age;

    @NotBlank(message = "Disease is required")
    private String disease;
}
