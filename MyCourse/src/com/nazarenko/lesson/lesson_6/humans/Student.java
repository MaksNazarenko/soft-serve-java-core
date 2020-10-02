package com.nazarenko.lesson.lesson_6.humans;

public class Student extends Human {
    private int groupNumber;
    private int[] grades;

    Student(){}

    Student(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int groupNumber) {
        super(firstName, lastName, dateOfBirth, countryOfBirth);
        this.groupNumber = groupNumber;
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

}
