package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.controller.structure.UniversityController;

import java.util.HashSet;
import java.util.Objects;

public class Faculty {
    private final String FACULTY_NAME;
    private final HashSet<Department> departments = new HashSet<>();

    public Faculty(String facultyName) {
        this.FACULTY_NAME = facultyName;
        UniversityController.addFacultyToUniversity(this);
    }

    public String getFacultyName() {
        return FACULTY_NAME;
    }

    void addDepartmentToFaculty(Department newDepartment) {
        this.departments.add(newDepartment);
    }

    public HashSet<Department> getDepartments() {
        return departments;
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

