package com.nazarenko.lesson.lesson6.university.structure;

import com.nazarenko.lesson.lesson6.university.people.Curator;
import com.nazarenko.lesson.lesson6.university.people.Teacher;
import com.nazarenko.lesson.lesson6.university.people.Student;

import java.util.ArrayList;

public class Group extends Department {
    private String groupName;
    private Curator groupCurator;
    private ArrayList<Teacher> groupTeachers;
    private ArrayList<Student> groupStudents;

    Group(String facultyName, String departmentName, String groupName, Curator groupCurator) {
        super(facultyName, departmentName);
        this.groupName = groupName;
        this.groupCurator = groupCurator;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupCurator(Curator newCurator) {
        this.groupCurator = newCurator;
    }

    public Curator getGroupCurator() {
        return groupCurator;
    }

    public ArrayList<Teacher> getGroupTeachers() {
        return groupTeachers;
    }

    public void addGroupTeacher(Teacher newGroupTeacher) {
        this.groupTeachers.add(newGroupTeacher);
    }

    public ArrayList<Student> getGroupStudents() {
        return groupStudents;
    }

    public void addGroupStudent(Student newGroupStudent) {
        this.groupStudents.add(newGroupStudent);
    }

    public void setGroupStudents(ArrayList<Student> groupStudents) {
        this.groupStudents.addAll(groupStudents);
    }
}
