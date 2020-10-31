package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class University {
    private static final String UNIVERSITY_NAME = "Royal University of Nazarenko";
    private static final HashSet<Faculty> FACULTIES = new HashSet<>();
    private static final HashSet<Department> DEPARTMENTS = new HashSet<>();
    private static final HashSet<Group> GROUPS = new HashSet<>();
    private static final ArrayList<Staff> STAFF = new ArrayList<>();
    private static final ArrayList<Teacher> TEACHERS = new ArrayList<>();
    private static final ArrayList<Student> STUDENTS = new ArrayList<>();
    private static final HashSet<Course> COURSES = new HashSet<>();

    public static String getUniversityName() {
        return UNIVERSITY_NAME;
    }

    public static HashSet<Faculty> getFaculties() {
        return FACULTIES;
    }

    public static HashSet<Department> getDepartments() {
        return DEPARTMENTS;
    }

    public static HashSet<Group> getGroups() {
        return GROUPS;
    }

    public static ArrayList<Staff> getStaff() {
        return STAFF;
    }

    public static ArrayList<Teacher> getTeachers() {
        return TEACHERS;
    }

    public static ArrayList<Student> getStudents() {
        return STUDENTS;
    }

    public static HashSet<Course> getCourses() {
        return COURSES;
    }

}
