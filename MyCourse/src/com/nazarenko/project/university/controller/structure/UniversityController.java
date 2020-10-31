package com.nazarenko.project.university.controller.structure;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;
import com.nazarenko.project.university.model.structure.Department;
import com.nazarenko.project.university.model.structure.Faculty;
import com.nazarenko.project.university.model.structure.Group;
import com.nazarenko.project.university.model.structure.University;
import com.nazarenko.project.university.view.UniversityView;

import java.util.ArrayList;
import java.util.HashSet;

public class UniversityController {

    public static String getUniversityName() {
        return University.getUniversityName();
    }

    public static void addFacultyToUniversity(Faculty newFaculty) {
        University.getFaculties().add(newFaculty);
    }

    public static HashSet<Faculty> getFaculties() {
        return University.getFaculties();
    }

    public static void addDepartmentToUniversity(Department newDepartment) {
        University.getDepartments().add(newDepartment);
    }

    public static HashSet<Department> getDepartments() {
        return University.getDepartments();
    }

    public static void addGroupToUniversity(Group newGroup) {
        University.getGroups().add(newGroup);
    }

    public static HashSet<Group> getGroups() {
        return University.getGroups();
    }

    public static void addStaffToUniversity(Staff newStaff) {
        University.getStaff().add(newStaff);
    }

    public static ArrayList<Staff> getStaff() {
        return University.getStaff();
    }

    public static void addTeacherToUniversity(Teacher newTeacher) {
        University.getTeachers().add(newTeacher);
    }

    public static ArrayList<Teacher> getTeachers() {
        return University.getTeachers();
    }

    public static void addStudentsToUniversity(Student newStudent) {
        University.getStudents().add(newStudent);
    }

    public static ArrayList<Student> getStudents() {
        return University.getStudents();
    }

    public static void addCourseToUniversity(Course newCourse) {
        University.getCourses().add(newCourse);
    }

    public static HashSet<Course> getCourses() {
        return University.getCourses();
    }

    public static void updateView() {
        UniversityView.printUniversityStructure();
    }

}
