package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;

import java.util.ArrayList;
import java.util.HashSet;

public class University {
    private static final String UNIVERSITY_NAME = "Royal University of Nazarenko";
    private static final HashSet<Faculty> faculties = new HashSet<>();
    private static final HashSet<Department> departments = new HashSet<>();
    private static final HashSet<Group> groups = new HashSet<>();
    private static final ArrayList<Staff> staff = new ArrayList<>();
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final HashSet<Course> courses = new HashSet<>();

    /**
    * A private Constructor prevents any other class from
    * instantiating.
    */
    private University(){}

    public static String getUniversityName() {
        return UNIVERSITY_NAME;
    }

    static void addFacultyToUniversity(Faculty newFaculty) {
        faculties.add(newFaculty);
    }

    public static HashSet<Faculty> getFaculties() {
        return faculties;
    }

    static void addDepartmentToUniversity(Department newDepartment) {
        departments.add(newDepartment);
    }

    public static HashSet<Department> getDepartments() {
        return departments;
    }

    static void addGroupToUniversity(Group newGroup) {
        groups.add(newGroup);
    }

    public static HashSet<Group> getGroups() {
        return groups;
    }

    public static void addStaffToUniversity(Staff newStaff) {
        staff.add(newStaff);
    }

    public static ArrayList<Staff> getStaff() {
        return staff;
    }

    public static void addTeacherToUniversity(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static void addStudentsToUniversity(Student newStudent) {
        students.add(newStudent);
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addCourseToUniversity(Course newCourse) {
        courses.add(newCourse);
    }

    public static HashSet<Course> getCourses() {
        return courses;
    }

}
