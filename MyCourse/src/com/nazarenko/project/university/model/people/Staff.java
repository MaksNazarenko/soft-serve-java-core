package com.nazarenko.project.university.model.people;

import com.nazarenko.project.university.controller.structure.UniversityController;
import com.nazarenko.project.university.model.structure.University;

import java.time.LocalDate;

public class Staff extends Employee {
    private String professionName;

    public Staff(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
                 LocalDate hireDate, float salaryRate, String professionName) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, hireDate, salaryRate);
        this.professionName = professionName;
        UniversityController.addStaffToUniversity(this);
    }

    public String getProfessionName() {
        return professionName;
    }

    public void changeProfession(String newProfessionName) {
        this.professionName = newProfessionName;
    }
}
