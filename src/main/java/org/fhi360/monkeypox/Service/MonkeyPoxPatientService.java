package org.fhi360.monkeypox.Service;

import org.fhi360.monkeypox.Entity.MonkeyPoxPatient;

import java.util.List;
import java.util.UUID;

public interface MonkeyPoxPatientService {

    MonkeyPoxPatient saveMonkeyPoxPatient(MonkeyPoxPatient monkeyPoxPatient);

    List<MonkeyPoxPatient> getAllMonkeyPoxPatients();

    MonkeyPoxPatient getMonkeyPoxPatientById(UUID id);

    void deleteMonkeyPoxPatient(UUID id);

    MonkeyPoxPatient updateMonkeyPoxPatient(UUID id, MonkeyPoxPatient monkeyPoxPatient);
}



