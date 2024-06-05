package org.fhi360.monkeypox.RestController;

import jakarta.validation.Valid;
import org.fhi360.monkeypox.Entity.MonkeyPoxPatient;
import org.fhi360.monkeypox.Service.MonkeyPoxPatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MonkeyPoxPatientController {
    @Autowired
    private MonkeyPoxPatientServiceImpl service;


    @PostMapping("/monkeypox-patients")
    public ResponseEntity<MonkeyPoxPatient> createMonkeyPoxPatient(@Valid @RequestBody MonkeyPoxPatient monkeyPoxPatient) {
        MonkeyPoxPatient savedMonkeyPoxPatient = service.saveMonkeyPoxPatient(monkeyPoxPatient);
        return ResponseEntity.ok(savedMonkeyPoxPatient);
    }

    @GetMapping("/monkeypox-patients")
    public List<MonkeyPoxPatient> getAllMonkeyPoxPatients() {
        return service.getAllMonkeyPoxPatients();
    }

    @GetMapping("monkeypox-patients/{id}")
    public ResponseEntity<MonkeyPoxPatient> getMonkeyPoxPatientById(@PathVariable UUID id) {
        MonkeyPoxPatient monkeyPoxPatient = service.getMonkeyPoxPatientById(id);
        if (monkeyPoxPatient != null) {
            return ResponseEntity.ok(monkeyPoxPatient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/monkeypox-patients/{id}")
    public ResponseEntity<MonkeyPoxPatient> updateMonkeyPoxPatient(@PathVariable UUID id, @Valid @RequestBody MonkeyPoxPatient monkeyPoxPatientDetails) {
        MonkeyPoxPatient updatedMonkeyPoxPatient = service.updateMonkeyPoxPatient(id, monkeyPoxPatientDetails);
        return ResponseEntity.ok(updatedMonkeyPoxPatient);
    }

    @DeleteMapping("monkeypox-patients/{id}")
    public ResponseEntity<Void> deleteMonkeyPoxPatient(@PathVariable UUID id) {
        service.deleteMonkeyPoxPatient(id);
        return ResponseEntity.noContent().build();
    }
}
