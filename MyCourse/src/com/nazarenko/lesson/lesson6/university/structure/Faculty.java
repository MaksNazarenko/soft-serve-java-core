package com.nazarenko.lesson.lesson6.university.structure;

import java.util.ArrayList;

public class Faculty extends University {
    private String facultyName;
    private ArrayList<Department> departments; //todo same as in department

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}
