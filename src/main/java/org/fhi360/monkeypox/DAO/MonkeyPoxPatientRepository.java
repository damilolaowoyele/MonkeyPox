package org.fhi360.monkeypox.DAO;

import org.fhi360.monkeypox.Entity.MonkeyPoxPatient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MonkeyPoxPatientRepository extends JpaRepository<MonkeyPoxPatient, UUID> {
//    MonkeyPoxPatientRepository findMonkeyPoxByStateOfReporting(String stateOfReporting);
}




