package com.nazarenko.lesson.lesson6.university.people;


import java.time.LocalDate;

public class Staff extends Employee {
    private String professionName;

    Staff(){}

    Staff(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
          int socialSecurityNumber, LocalDate hireDate, int monthSalary, String professionName) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                socialSecurityNumber, hireDate, monthSalary);
        this.professionName = professionName;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }
}
