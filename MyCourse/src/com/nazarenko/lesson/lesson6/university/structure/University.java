package com.nazarenko.lesson.lesson6.university.structure;

import java.util.ArrayList;

public class University {
    private final String universityName = "Nazarenko's Royal University";
    private ArrayList<Faculty> faculties; //todo same as in department

    String getUniversityName() {
        return universityName;
    }
}
