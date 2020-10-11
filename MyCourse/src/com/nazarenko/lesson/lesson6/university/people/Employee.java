package com.nazarenko.lesson.lesson6.university.people;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Human {
    private LocalDate hireDate;
    private int monthSalary;

    Employee(){}

    Employee(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
             int socialSecurityNumber, LocalDate hireDate, int monthSalary) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber);
        this.hireDate = hireDate;
        this.monthSalary = monthSalary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

}
