package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.lesson.LessonsList;
import com.nazarenko.lesson.lesson6.university.structure.Group;
import com.nazarenko.lesson.lesson6.university.structure.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human implements Teachable {
    private Group group;
    private HashMap<LessonsList, ArrayList<Float>> grades;
    private static int countOfStudents;
    private final int studentId;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth) {
        super(firstName, lastName, dateOfBirth, countryOfBirth);
        this.studentId = ++countOfStudents;
        University.addStudentsToUniversity(this);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public boolean isTeachable() {
        System.out.println("Yes, I'm a student.");
        return true;
    }

}
