package com.nazarenko.project.university.people;

import java.time.LocalDate;

public abstract class Employee extends Human {
    private LocalDate hireDate;
    private float salaryRate;

    Employee(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
             LocalDate hireDate, float salaryRate) {
        super(firstName, lastName, dateOfBirth, countryOfBirth);
        this.hireDate = hireDate;
        this.salaryRate = salaryRate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public float salaryRate() {
        return salaryRate;
    }

    public void setMonthSalary(int monthSalary) {
        this.salaryRate = monthSalary;
    }

}
