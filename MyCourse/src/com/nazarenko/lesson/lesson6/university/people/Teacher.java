package com.nazarenko.lesson.lesson6.university.people;

public class Teacher extends Employee implements Teachable {
    private AcademicRank academicRank;



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


    @Override
    public void isTeachable() {
        System.out.println("Yes, I'm a teacher.");
    }
}
