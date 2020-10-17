package com.nazarenko.lesson.lesson6.university.people;

import com.nazarenko.lesson.lesson6.university.lesson.Course;
import com.nazarenko.lesson.lesson6.university.structure.Group;
import com.nazarenko.lesson.lesson6.university.structure.University;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Employee implements Teachable {
    private AcademicRank academicRank;
    private boolean isCurator = false;

    public Teacher (String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
                    LocalDate hireDate, float salaryRate) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                hireDate, salaryRate);
        University.addTeacherToUniversity(this);
    }

    public Teacher (String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
                   LocalDate hireDate, float salaryRate, AcademicRank academicRank) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                hireDate, salaryRate);
        this.academicRank = academicRank;
        University.addTeacherToUniversity(this);
    }

    public AcademicRank getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(AcademicRank academicRank) {
        this.academicRank = academicRank;
    }

    public boolean isCurator() {
        System.out.print("Am I curator? - ");
        return isCurator;
    }

    public void setCurator() {
        isCurator = true;
    }

    public boolean addGradeToStudent(Course course, Student student, Float newGrade) {
        if(course.getTeacherOfLectures().equals(this) && student.getCourses().contains(course)
                || course.getTeacherOfPractices().equals(this) && student.getCourses().contains(course)) {
            return student.addGrade(course, newGrade);
        } else {
            return false;
        }
    }

    @Override
    public boolean isTeachable() {
        System.out.print("Am I teacher? - ");
        return true;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
