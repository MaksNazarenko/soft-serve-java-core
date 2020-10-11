package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.structure.Group;

public class Curator extends Teacher {
    private Group group;

    Curator(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int socialSecurityNumber, int hireDate, int monthSalary, AcademicRank academicRank, Group group) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber, hireDate, monthSalary, academicRank);
        this.group = group;
    }
}
