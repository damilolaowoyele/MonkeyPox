package org.fhi360.monkeypox;

import org.fhi360.monkeypox.Entity.MonkeyPoxPatient;
import org.fhi360.monkeypox.Service.MonkeyPoxPatientServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MonkeyPoxPatientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MonkeyPoxPatientServiceImpl service;

    private MonkeyPoxPatient patient;

    @BeforeEach
    public void setup() {
        patient = new MonkeyPoxPatient();
        patient.setId(UUID.randomUUID());
        // set other properties of patient...
    }

    @Test
    public void testCreateMonkeyPoxPatient() throws Exception {
        when(service.saveMonkeyPoxPatient(any(MonkeyPoxPatient.class))).thenReturn(patient);

        mockMvc.perform(post("/api/monkeypox-patients")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"dateOfReport\": \"2024-03-10T10:00:00.000+00:00\",\n" +
                                "    \"dateOfNotification\": \"2024-03-11T10:00:00.000+00:00\",\n" +
                                "    \"dateOfInvestigation\": \"2024-03-12T10:00:00.000+00:00\",\n" +
                                "    \"notifiedBy\": \"Dr. Sam Smith\",\n" +
                                "    \"stateOfReporting\": \"State C\",\n" +
                                "    \"lga\": \"LGA C\",\n" +
                                "    \"ward\": \"Ward C\",\n" +
                                "    \"placeOfDetection\": \"Clinic C\",\n" +
                                "    \"firstName\": \"Charlie\",\n" +
                                "    \"lastName\": \"Brown\",\n" +
                                "    \"dateOfBirth\": \"1992-11-22T00:00:00.000+00:00\",\n" +
                                "    \"age\": 31,\n" +
                                "    \"sex\": \"Male\",\n" +
                                "    \"phoneNumber\": \"234-567-8901\",\n" +
                                "    \"educationLevel\": \"University\",\n" +
                                "    \"stateOfResidence\": \"State C\",\n" +
                                "    \"lgaOfResidence\": \"LGA C\",\n" +
                                "    \"wardOfResidence\": \"Ward C\",\n" +
                                "    \"residentialAddress\": \"789 Boulevard C\",\n" +
                                "    \"settlementType\": \"Urban\",\n" +
                                "    \"epidNumber\": \"EPID24680\",\n" +
                                "    \"traveledLast3Weeks\": true,\n" +
                                "    \"smallpoxVaccinationScar\": false,\n" +
                                "    \"rash\": true,\n" +
                                "    \"contactWithSimilarSymptoms\": true,\n" +
                                "    \"contactWithAnimals\": true,\n" +
                                "    \"dateOfSymptomOnset\": \"2024-03-13T10:00:00.000+00:00\",\n" +
                                "    \"redEyes\": true,\n" +
                                "    \"fever\": false,\n" +
                                "    \"lesions\": true,\n" +
                                "    \"cough\": false,\n" +
                                "    \"sensitivityToLight\": true,\n" +
                                "    \"vomitingOrNausea\": true,\n" +
                                "    \"soreThroat\": false,\n" +
                                "    \"oralUlcer\": true,\n" +
                                "    \"lymphadenopathy\": true,\n" +
                                "    \"chillsOrSweats\": false,\n" +
                                "    \"musclePain\": true,\n" +
                                "    \"headache\": false,\n" +
                                "    \"skinUlcer\": true,\n" +
                                "    \"fatigue\": true,\n" +
                                "    \"pruritus\": false,\n" +
                                "    \"hivPositive\": true,\n" +
                                "    \"hivNegative\": false,\n" +
                                "    \"hivCare\": false,\n" +
                                "    \"referredForART\": true,\n" +
                                "    \"healthFacility\": \"Clinic C\",\n" +
                                "    \"hospitalNumber\": \"HOSP789\",\n" +
                                "    \"specimenCollected\": true,\n" +
                                "    \"dateOfSpecimenCollected\": \"2024-03-14T10:00:00.000+00:00\",\n" +
                                "    \"typeOfSpecimen\": \"Blood\",\n" +
                                "    \"testingLaboratory\": \"Lab C\"\n}")) // replace with actual patient JSON
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdateMonkeyPoxPatient() throws Exception {
        when(service.updateMonkeyPoxPatient(any(UUID.class), any(MonkeyPoxPatient.class))).thenReturn(patient);

        mockMvc.perform(put("/api/monkeypox-patients/" + patient.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\": \"d691e49f-5ade-406c-b5c4-e41977076611\",\n" +
                                "        \"dateOfReport\": \"2023-12-31T23:00:00.000+00:00\",\n" +
                                "        \"dateOfNotification\": \"2024-01-01T23:00:00.000+00:00\",\n" +
                                "        \"dateOfInvestigation\": \"2024-01-02T23:00:00.000+00:00\",\n" +
                                "        \"notifiedBy\": \"Dr. Mandela Ogungbemi\",\n" +
                                "        \"stateOfReporting\": \"State Z\",\n" +
                                "        \"lga\": \"LGA Z\",\n" +
                                "        \"ward\": \"Ward Z\",\n" +
                                "        \"placeOfDetection\": \"Hospital XYZ\",\n" +
                                "        \"firstName\": \"Taofeeq\",\n" +
                                "        \"lastName\": \"Owoyele\",\n" +
                                "        \"dateOfBirth\": \"1990-05-09T23:00:00.000+00:00\",\n" +
                                "        \"age\": 34,\n" +
                                "        \"sex\": \"Female\",\n" +
                                "        \"phoneNumber\": \"123-456-7890\",\n" +
                                "        \"educationLevel\": \"College\",\n" +
                                "        \"stateOfResidence\": \"State A\",\n" +
                                "        \"lgaOfResidence\": \"LGA A\",\n" +
                                "        \"wardOfResidence\": \"Ward A\",\n" +
                                "        \"residentialAddress\": \"123 Street A\",\n" +
                                "        \"settlementType\": \"Urban\",\n" +
                                "        \"epidNumber\": \"EPID12345\",\n" +
                                "        \"traveledLast3Weeks\": true,\n" +
                                "        \"smallpoxVaccinationScar\": true,\n" +
                                "        \"rash\": true,\n" +
                                "        \"contactWithSimilarSymptoms\": true,\n" +
                                "        \"contactWithAnimals\": true,\n" +
                                "        \"dateOfSymptomOnset\": \"2024-01-03T23:00:00.000+00:00\",\n" +
                                "        \"redEyes\": true,\n" +
                                "        \"fever\": true,\n" +
                                "        \"lesions\": true,\n" +
                                "        \"cough\": true,\n" +
                                "        \"sensitivityToLight\": true,\n" +
                                "        \"vomitingOrNausea\": true,\n" +
                                "        \"soreThroat\": true,\n" +
                                "        \"oralUlcer\": true,\n" +
                                "        \"lymphadenopathy\": true,\n" +
                                "        \"chillsOrSweats\": true,\n" +
                                "        \"musclePain\": true,\n" +
                                "        \"headache\": true,\n" +
                                "        \"skinUlcer\": true,\n" +
                                "        \"fatigue\": true,\n" +
                                "        \"pruritus\": false,\n" +
                                "        \"hivPositive\": true,\n" +
                                "        \"hivNegative\": true,\n" +
                                "        \"hivCare\": false,\n" +
                                "        \"referredForART\": false,\n" +
                                "        \"healthFacility\": \"Hospital A\",\n" +
                                "        \"hospitalNumber\": \"HOSP123\",\n" +
                                "        \"specimenCollected\": true,\n" +
                                "        \"dateOfSpecimenCollected\": \"2024-01-04T23:00:00.000+00:00\",\n" +
                                "        \"typeOfSpecimen\": \"Blood\",\n" +
                                "        \"testingLaboratory\": \"Lab A\"}")) // replace with actual patient JSON
                .andExpect(status().isOk());
    }

    // add more tests for other endpoints...
    @Test
    public void testGetMonkeyPoxPatient() throws Exception {
        when(service.getMonkeyPoxPatientById(any(UUID.class))).thenReturn(patient);

        mockMvc.perform(get("/api/monkeypox-patients/" + patient.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetAllMonkeyPoxPatients() throws Exception {
        List<MonkeyPoxPatient> patients = Arrays.asList(patient);
        when(service.getAllMonkeyPoxPatients()).thenReturn(patients);

        mockMvc.perform(get("/api/monkeypox-patients")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testDeleteMonkeyPoxPatient() throws Exception {
        doNothing().when(service).deleteMonkeyPoxPatient(any(UUID.class));

        mockMvc.perform(delete("/api/monkeypox-patients/" + patient.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

//        UUID existingPatientId = UUID.fromString("bde62dee-45ef-4f63-b8e0-3b9e4fe3a592");
//        doNothing().when(service).deleteMonkeyPoxPatient(existingPatientId);
//
//        mockMvc.perform(delete("/api/monkeypox-patients/" + existingPatientId)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
    }

}
