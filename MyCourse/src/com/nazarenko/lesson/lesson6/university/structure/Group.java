package com.nazarenko.lesson.lesson6.university.structure;

import com.nazarenko.lesson.lesson6.university.people.Teacher;
import com.nazarenko.lesson.lesson6.university.people.Student;

import java.util.ArrayList;

public class Group extends Department {
    private String groupName;
    private Teacher groupCurator; //todo synchronize group's curator and curator's group
    private ArrayList<Teacher> groupTeachers; //todo synchronize group's teachers and teachers' group
    private ArrayList<Student> groupStudents; //todo synchronize group's students and student's group

    Group(String facultyName, String departmentName, String groupName) {
        super(facultyName, departmentName);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupCurator(Teacher groupCurator) {
        this.groupCurator = groupCurator;
    }

    public Teacher getGroupCurator() {
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

    public void addGroupStudent(ArrayList<Student> students, int studentId) {
        this.groupStudents.add(students.get(studentId));
    }

    public void setGroupStudents(ArrayList<Student> groupStudents) {
        this.groupStudents.addAll(groupStudents);
    }

    public void deleteGroupStudents(int id) {
        groupStudents.remove(id);
    }
}
