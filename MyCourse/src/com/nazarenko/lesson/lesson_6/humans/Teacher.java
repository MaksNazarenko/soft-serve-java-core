package com.nazarenko.lesson.lesson_6.humans;

public class Teacher extends Employee {
    private AcademicRank academicRank;

    Teacher(){}

    Teacher(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int socialSecurityNumber, int hireDate, int monthSalary, AcademicRank academicRank) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber, hireDate, monthSalary);
        this.academicRank = academicRank;
    }

    public AcademicRank getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(AcademicRank academicRank) {
        this.academicRank = academicRank;
    }


}
