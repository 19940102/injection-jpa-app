package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entities.Patient;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository <Patient, Long> {
public List<Patient> findByMalade(boolean m);
List<Patient> findByMalade(boolean m, Pageable pageable);


}
