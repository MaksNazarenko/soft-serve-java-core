package com.nazarenko.project.university.structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Faculty implements Structure {
    private final String FACULTY_NAME;
    private final HashSet<Department> departments = new HashSet<>();

    public Faculty(String facultyName) {
        this.FACULTY_NAME = facultyName;
        University.addFacultyToUniversity(this);
    }

    public String getFacultyName() {
        return FACULTY_NAME;
    }

    void addDepartmentToFaculty(Department newDepartment) {
        this.departments.add(newDepartment);
    }

    private String[] listOfDepartmentsOfFaculty() {
        String[] print = new String[departments.size()];
        int id = 0;
        for (Department department : departments) {
            print[id] = ++id + ". " + department.getDepartmentName();
        }
        return print;
    }

    public HashSet<Department> getDepartments() {
        return departments;
    }

    @Override
    public void printStructure() {
        System.out.println("Departments of " + getFacultyName() + ":\n" +
                " " + Arrays.toString(listOfDepartmentsOfFaculty()));
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "FACULTY_NAME='" + FACULTY_NAME + '\'' +
                ", departments=" + departments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return FACULTY_NAME.equals(faculty.FACULTY_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FACULTY_NAME);
    }
}

