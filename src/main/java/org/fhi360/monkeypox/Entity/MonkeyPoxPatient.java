package org.fhi360.monkeypox.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "monkey_pox")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MonkeyPoxPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(name = "date_of_report")
    @NotNull(message = "Date of report cannot be null")
    private Date dateOfReport;

    @Column(name = "date_of_notification")
    @NotNull(message = "Date of notification cannot be null")
    private Date dateOfNotification;

    @Column(name = "date_of_investigation")
    @NotNull(message = "Date of investigation cannot be null")
    private Date dateOfInvestigation;

    @Column(name = "notified_by")
    @NotBlank(message = "Notified by cannot be blank")
    @Size(max = 255, message = "Notified by cannot exceed 255 characters")
    private String notifiedBy;

    @Column(name = "state_of_reporting")
    @NotBlank(message = "State of reporting cannot be blank")
    @Size(max = 255, message = "State of reporting cannot exceed 255 characters")
    private String stateOfReporting;

    @Column(name = "lga")
    @NotBlank(message = "LGA cannot be blank")
    @Size(max = 255, message = "LGA cannot exceed 255 characters")
    private String lga;

    @Column(name = "ward")
    @NotBlank(message = "Ward cannot be blank")
    @Size(max = 255, message = "Ward cannot exceed 255 characters")
    private String ward;

    @Column(name = "place_of_detection")
    @NotBlank(message = "Place of detection cannot be blank")
    @Size(max = 255, message = "Place of detection cannot exceed 255 characters")
    private String placeOfDetection;

    @Column(name = "first_name")
    @NotBlank(message = "First name cannot be blank")
    @Size(max = 255, message = "First name cannot exceed 255 characters")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 255, message = "Last name cannot exceed 255 characters")
    private String lastName;

    @Column(name = "date_of_birth")
    @NotNull(message = "Date of birth cannot be null")
    private Date dateOfBirth;

    @Column(name = "age")
    @Min(value = 0, message = "Age cannot be negative")
    @Max(value = 120, message = "Age cannot exceed 120")
    private Integer age;

    @Column(name = "sex")
    @NotBlank(message = "Sex cannot be blank")
    @Size(max = 10, message = "Sex cannot exceed 10 characters")
    private String sex;

    @Column(name = "phone_number")
    @NotBlank(message = "Phone number cannot be blank")
    @Size(max = 20, message = "Phone number cannot exceed 20 characters")
    private String phoneNumber;

    @Column(name = "education_level")
    @NotBlank(message = "Education level cannot be blank")
    @Size(max = 255, message = "Education level cannot exceed 255 characters")
    private String educationLevel;

    @Column(name = "state_of_residence")
    @NotBlank(message = "State of residence cannot be blank")
    @Size(max = 255, message = "State of residence cannot exceed 255 characters")
    private String stateOfResidence;

    @Column(name = "lga_of_residence")
    @NotBlank(message = "LGA of residence cannot be blank")
    @Size(max = 255, message = "LGA of residence cannot exceed 255 characters")
    private String lgaOfResidence;

    @Column(name = "ward_of_residence")
    @NotBlank(message = "Ward of residence cannot be blank")
    @Size(max = 255, message = "Ward of residence cannot exceed 255 characters")
    private String wardOfResidence;

    @Column(name = "residential_address")
    @NotBlank(message = "Residential address cannot be blank")
    @Size(max = 255, message = "Residential address cannot exceed 255 characters")
    private String residentialAddress;

    @Column(name = "settlement_type")
    @NotBlank(message = "Settlement type cannot be blank")
    @Size(max = 10, message = "Settlement type cannot exceed 10 characters")
    private String settlementType;

    @Column(name = "epid_number")
    @NotBlank(message = "EPID number cannot be blank")
    @Size(max = 255, message = "EPID number cannot exceed 255 characters")
    private String epidNumber;

    @Column(name = "traveled_last_3_weeks")
    @NotNull(message = "Traveled last 3 weeks cannot be null")
    private Boolean traveledLast3Weeks;

    @Column(name = "smallpox_vaccination_scar")
    @NotNull(message = "Smallpox vaccination scar cannot be null")
    private Boolean smallpoxVaccinationScar;

    @Column(name = "rash")
    @NotNull(message = "Rash cannot be null")
    private Boolean rash;

    @Column(name = "contact_with_similar_symptoms")
    @NotNull(message = "Contact with similar symptoms cannot be null")
    private Boolean contactWithSimilarSymptoms;

    @Column(name = "contact_with_animals")
    @NotNull(message = "Contact with animals cannot be null")
    private Boolean contactWithAnimals;

    @Column(name = "date_of_symptom_onset")
    @NotNull(message = "Date of symptom onset cannot be null")
    private Date dateOfSymptomOnset;

    @Column(name = "red_eyes")
    @NotNull(message = "Red eyes cannot be null")
    private Boolean redEyes;

    @Column(name = "fever")
    @NotNull(message = "Fever cannot be null")
    private Boolean fever;

    @Column(name = "lesions")
    @NotNull(message = "Lesions cannot be null")
    private Boolean lesions;

    @Column(name = "cough")
    @NotNull(message = "Cough cannot be null")
    private Boolean cough;

    @Column(name = "sensitivity_to_light")
    @NotNull(message = "Sensitivity to light cannot be null")
    private Boolean sensitivityToLight;

    @Column(name = "vomiting_or_nausea")
    @NotNull(message = "Vomiting or nausea cannot be null")
    private Boolean vomitingOrNausea;

    @Column(name = "sore_throat")
    @NotNull(message = "Sore throat cannot be null")
    private Boolean soreThroat;

    @Column(name = "oral_ulcer")
    @NotNull(message = "Oral ulcer cannot be null")
    private Boolean oralUlcer;

    @Column(name = "lymphadenopathy")
    @NotNull(message = "Lymphadenopathy cannot be null")
    private Boolean lymphadenopathy;

    @Column(name = "chills_or_sweats")
    @NotNull(message = "Chills or sweats cannot be null")
    private Boolean chillsOrSweats;

    @Column(name = "muscle_pain")
    @NotNull(message = "Muscle pain cannot be null")
    private Boolean musclePain;

    @Column(name = "headache")
    @NotNull(message = "Headache cannot be null")
    private Boolean headache;

    @Column(name = "skin_ulcer")
    @NotNull(message = "Skin ulcer cannot be null")
    private Boolean skinUlcer;

    @Column(name = "fatigue")
    @NotNull(message = "Fatigue cannot be null")
    private Boolean fatigue;

    @Column(name = "pruritus")
    @NotNull(message = "Pruritus cannot be null")
    private Boolean pruritus;

    @Column(name = "hiv_positive")
    @NotNull(message = "HIV positive cannot be null")
    private Boolean hivPositive;

    @Column(name = "hiv_negative")
    @NotNull(message = "HIV negative cannot be null")
    private Boolean hivNegative;

    @Column(name = "hiv_care")
    @NotNull(message = "HIV care cannot be null")
    private Boolean hivCare;

    @Column(name = "referred_for_art")
    @NotNull(message = "Referred for ART cannot be null")
    private Boolean referredForART;

    @Column(name = "health_facility")
    @NotBlank(message = "Health facility cannot be blank")
    @Size(max = 255, message = "Health facility cannot exceed 255 characters")
    private String healthFacility;

    @Column(name = "hospital_number")
    @NotBlank(message = "Hospital number cannot be blank")
    @Size(max = 255, message = "Hospital number cannot exceed 255 characters")
    private String hospitalNumber;

    @Column(name = "specimen_collected")
    @NotNull(message = "Specimen collected cannot be null")
    private Boolean specimenCollected;

    @Column(name = "date_of_specimen_collected")
    @NotNull(message = "Date of specimen collected cannot be null")
    private Date dateOfSpecimenCollected;

    @Column(name = "type_of_specimen")
    @NotBlank(message = "Type of specimen cannot be blank")
    @Size(max = 255, message = "Type of specimen cannot exceed 255 characters")
    private String typeOfSpecimen;

    @Column(name = "testing_laboratory")
    @NotBlank(message = "Testing laboratory cannot be blank")
    @Size(max = 255, message = "Testing laboratory cannot exceed 255 characters")
    private String testingLaboratory;

}
