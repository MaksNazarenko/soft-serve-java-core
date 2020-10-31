package com.nazarenko.project.university.view;

import com.nazarenko.project.university.model.structure.University;

import java.util.Arrays;

public class PrintToConsole {

    public static void printUniversityStructure() {
        System.out.println(University.getUniversityName() + " structure: \n" +
                "   Faculties: " + Arrays.toString(University.listOfFacultiesOfUniversity()) + "\n" +
                "   Departments: " + Arrays.toString(University.listOfDepartmentsOfUniversity()) + "\n" +
                "   Groups: " + Arrays.toString(University.listOfGroupsOfUniversity()) + "\n" +
                "   Students: " + Arrays.toString(University.listOfStudentsOfUniversity()) + "\n" +
                "   Teachers: " + Arrays.toString(University.listOfTeachersOfUniversity()) + "\n" +
                "   Staff: " + Arrays.toString(University.listOfStaffOfUniversity()) + "\n" +
                "   Courses: " + Arrays.toString(University.listOfCoursesOfUniversity()) + "\n");
    }

}
