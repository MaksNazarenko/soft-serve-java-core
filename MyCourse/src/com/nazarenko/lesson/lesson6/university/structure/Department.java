package com.nazarenko.lesson.lesson6.university.structure;

import java.util.ArrayList;

public class Department extends Faculty {
    private String departmentName;
    private ArrayList<Group> groups; //todo how to get list of all groups in particular department?

    Department(String facultyName, String departmentName) {
        super(facultyName);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }
}
