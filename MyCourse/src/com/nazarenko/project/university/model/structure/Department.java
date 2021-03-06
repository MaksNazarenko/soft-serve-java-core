package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.controller.structure.UniversityController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Department {
    private final String DEPARTMENT_NAME;
    private final HashSet<Group> groups = new HashSet<>();

    public Department(String departmentName, Faculty facultyOfDepartment) {
        this.DEPARTMENT_NAME = departmentName;
        facultyOfDepartment.addDepartmentToFaculty(this);
        UniversityController.addDepartmentToUniversity(this);
    }

    public String getDepartmentName() {
        return this.DEPARTMENT_NAME;
    }

    void addGroupToDepartment(Group newGroup) {
        this.groups.add(newGroup);
    }

    public HashSet<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DEPARTMENT_NAME='" + DEPARTMENT_NAME + '\'' +
                ", groups=" + groups +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return DEPARTMENT_NAME.equals(that.DEPARTMENT_NAME) &&
                groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DEPARTMENT_NAME, groups);
    }


}
