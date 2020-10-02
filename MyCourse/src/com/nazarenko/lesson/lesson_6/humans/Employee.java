package com.nazarenko.lesson.lesson_6.humans;

public class Employee extends Human {
    private int hireDate;
    private int monthSalary;

    Employee(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int hireDate, int monthSalary) {
        super(firstName, lastName, dateOfBirth, countryOfBirth);
        this.hireDate = hireDate;
        this.monthSalary = monthSalary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }
}