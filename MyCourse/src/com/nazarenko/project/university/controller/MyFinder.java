package com.nazarenko.project.university.controller;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;
import com.nazarenko.project.university.model.structure.University;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class MyFinder {

    static Teacher findTeacher(long teacherSSN) {
        ArrayList<Teacher> teachers = University.getTeachers();
        for (Teacher currentTeacher : teachers) {
            if(currentTeacher.getSOCIAL_SECURITY_NUMBER() == teacherSSN) {
                return currentTeacher;
            }
        }
        return null;
    }

    static Student findStudent(int studentId) {
        ArrayList<Student> students = University.getStudents();
        for (Student currentStudent : students) {
            if(currentStudent.getStudentId() == studentId) {
                return currentStudent;
            }
        }
        return null;
    }

    static Course findCourse(String courseName) {
        HashSet<Course> courses = University.getCourses();
        for (Course currentCourse : courses) {
            if(currentCourse.getCOURSE_NAME().equals(courseName)) {
                return currentCourse;
            }
        }
        return null;
    }

}
