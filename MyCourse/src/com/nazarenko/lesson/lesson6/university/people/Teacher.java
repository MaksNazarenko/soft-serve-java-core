package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.structure.Group;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Employee implements Teachable {
    private AcademicRank academicRank;
    private ArrayList<Group> groups; //todo synchronize group's teachers and teachers' group


    Teacher(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
            int socialSecurityNumber, LocalDate hireDate, int monthSalary, AcademicRank academicRank) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                socialSecurityNumber, hireDate, monthSalary);
        this.academicRank = academicRank;
    }

    public AcademicRank getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(AcademicRank academicRank) {
        this.academicRank = academicRank;
    }


    @Override
    public boolean isTeachable() {
        System.out.println("Yes, I'm a teacher.");
        return true;
    }
}
