package com.nazarenko.project.university.model.people;

import com.nazarenko.project.university.controller.structure.UniversityController;
import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.structure.University;

import java.time.LocalDate;

public class Teacher extends Employee implements Teachable {
    private AcademicRank academicRank;
    private boolean isCurator = false;

    public Teacher (String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
                    LocalDate hireDate, float salaryRate) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                hireDate, salaryRate);
        UniversityController.addTeacherToUniversity(this);
    }

    public Teacher (String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth,
                   LocalDate hireDate, float salaryRate, AcademicRank academicRank) {
        super(firstName, lastName, dateOfBirth, countryOfBirth,
                hireDate, salaryRate);
        this.academicRank = academicRank;
        UniversityController.addTeacherToUniversity(this);
    }

    public AcademicRank getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(AcademicRank academicRank) {
        this.academicRank = academicRank;
    }

    public boolean isCurator() {
//        System.out.print("Am I curator? - ");
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
//        System.out.print("Am I teacher? - ");
        return true;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
