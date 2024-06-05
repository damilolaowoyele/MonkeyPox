package org.fhi360.monkeypox.Service;

import org.fhi360.monkeypox.DAO.MonkeyPoxPatientRepository;
import org.fhi360.monkeypox.Entity.MonkeyPoxPatient;
import org.fhi360.monkeypox.Exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class MonkeyPoxPatientServiceImpl implements MonkeyPoxPatientService{

    private MonkeyPoxPatientRepository repository;

    @Autowired
    public MonkeyPoxPatientServiceImpl(MonkeyPoxPatientRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public MonkeyPoxPatient saveMonkeyPoxPatient(MonkeyPoxPatient monkeyPoxPatient) {
        return repository.save(monkeyPoxPatient);
    }

    public List<MonkeyPoxPatient> getAllMonkeyPoxPatients() {
        return repository.findAll();
    }

//    public MonkeyPoxPatient getMonkeyPoxPatientById(UUID id) {
//        return repository.findById(id).orElse(null);
//    }
    @Override
    public MonkeyPoxPatient getMonkeyPoxPatientById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MonkeyPoxPatient not found with id " + id));
    }


    @Transactional
    @Override
    public MonkeyPoxPatient updateMonkeyPoxPatient(UUID id, MonkeyPoxPatient monkeyPoxPatientDetails) {
        return repository.findById(id)
                .map(monkeyPoxPatient -> {
                    BeanUtils.copyProperties(monkeyPoxPatientDetails, monkeyPoxPatient, "id");
                    return repository.save(monkeyPoxPatient);
                })
                .orElseThrow(() -> new ResourceNotFoundException("MonkeyPoxPatient not found with id " + id));
    }



    @Transactional
    @Override
    public void deleteMonkeyPoxPatient(UUID id) {
        repository.deleteById(id);
    }


}
