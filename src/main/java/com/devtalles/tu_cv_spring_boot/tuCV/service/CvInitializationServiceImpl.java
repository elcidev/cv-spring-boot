package com.devtalles.tu_cv_spring_boot.tuCV.service;

import com.devtalles.tu_cv_spring_boot.tuCV.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CvInitializationServiceImpl implements CvInitializationService {

    @Override
    public CvData initializeCvData() {
        CvData cvData = new CvData();

        // Datos Personales

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("Elcira");
        personalDetails.setLastName("Ibarra");
        personalDetails.setEmail("elcicode@duck.com");
        personalDetails.setProfessionalProfile("Desarrolladora Backend");

        cvData.setPersonalDetails(personalDetails);

        // Education

        Education education1 = new Education();

        education1.setInstitution("Lidr");
        education1.setDegree("AI4Devs");
        education1.setPeriod("Marzo - Julio 2026");
        education1.setDescription("Formación de desarrollo de software con AI");
        cvData.setEducations(Collections.singletonList(education1));

        // Experience

        Experience experience1 = new Experience();

        experience1.setJobTitle("Frontend Developer");
        experience1.setCompany("Qubik");
        experience1.setPeriod("2023-2024");
        experience1.setDescription("Escuela de Frontend con Spartacus");

        cvData.setExperiences(List.of(experience1));

        // Habilidades

        Skill skill1 = new Skill();

        skill1.setName("Angular");
        skill1.setLevel("Avanzado");

        Skill skill2 = new Skill();

        skill2.setName("Angular");
        skill2.setLevel("Avanzado");

        cvData.setSkills(Arrays.asList(skill1, skill2));

        return cvData;
    }
}
