package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.people.Employee;

public class Staff extends Employee {
    private String professionName;

    Staff(){}

    Staff(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int socialSecurityNumber, int hireDate, int monthSalary, String professionName) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber, hireDate, monthSalary);
        this.professionName = professionName;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }
}
