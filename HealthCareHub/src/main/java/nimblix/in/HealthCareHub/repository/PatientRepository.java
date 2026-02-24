package nimblix.in.HealthCareHub.repository;
import nimblix.in.HealthCareHub.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PatientRepository {
    boolean existsByEmail(String email);
}
