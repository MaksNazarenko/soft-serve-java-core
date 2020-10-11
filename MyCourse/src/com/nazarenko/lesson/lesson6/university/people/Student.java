package com.nazarenko.lesson.lesson6.university.people;

import java.util.ArrayList;

public class Student extends Human implements Teachable {
    private int groupNumber;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(){}

    Student(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int socialSecurityNumber, int groupNumber) {
        super(firstName, lastName, dateOfBirth, countryOfBirth, socialSecurityNumber);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(Integer grade) {
        this.grades.add(grade);
    }


    @Override
    public void isTeachable() {
        System.out.println("Yes, I'm a student.");
    }
}
