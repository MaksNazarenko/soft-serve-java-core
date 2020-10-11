package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.lesson.Lesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human implements Teachable {
    private int groupNumber; //todo synchronize group's students and student's group
    private HashMap<Lesson, Integer> grades = new HashMap<Lesson, Integer>();
    private static int id = 1;
    private int studentId;

    public Student(){
        this.studentId = id;
        id++;
    }

    Student(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth, int socialSecurityNumber, int groupNumber) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber);
        this.groupNumber = groupNumber;
        this.studentId = id;
        id++;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    public HashMap<Lesson, Integer> getGrades() {
        return grades;
    }

    public void addGrade(Lesson lesson, Integer grade) {
        this.grades.put(lesson, grade);
    }


    @Override
    public boolean isTeachable() {
        System.out.println("Yes, I'm a student.");
        return true;
    }

    public int getStudentId() {
        return studentId;
    }
}
