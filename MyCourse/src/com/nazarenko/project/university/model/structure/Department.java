package com.nazarenko.project.university.model.structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Department {
    private final String DEPARTMENT_NAME;
    private final HashSet<Group> groups = new HashSet<>();

    public Department(String departmentName, Faculty facultyOfDepartment) {
        this.DEPARTMENT_NAME = departmentName;
        facultyOfDepartment.addDepartmentToFaculty(this);
        University.addDepartmentToUniversity(this);
    }

    public String getDepartmentName() {
        return this.DEPARTMENT_NAME;
    }

    void addGroupToDepartment(Group newGroup) {
        this.groups.add(newGroup);
    }

    public String[] listOfGroupsOfDepartment() {
        String[] print = new String[groups.size()];
        int id = 0;
        for (Group group : groups) {
            print[id] = ++id + ". " + group.getGroupName();
        }
        return print;
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
