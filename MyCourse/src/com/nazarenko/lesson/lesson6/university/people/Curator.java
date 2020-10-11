package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.structure.Group;

import java.time.LocalDate;
import java.util.Date;

public class Curator extends Teacher {
    private Group group; //todo synchronize group's curator and curator's group

    Curator(String firstName, String lastName, LocalDate dateOfBirth,
            String countryOfBirth, int socialSecurityNumber, LocalDate hireDate,
            int monthSalary, AcademicRank academicRank, Group group) {

        super(firstName, lastName, dateOfBirth,
                countryOfBirth, socialSecurityNumber, hireDate,
                monthSalary, academicRank);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void changeGroupToCurate(Group newGroupToCurate) {
        this.group = newGroupToCurate;
    }

    @Override
    public boolean isTeachable() {
        System.out.println("Yes, I'm a curator of " + getGroup());
        return true;
    }
}
