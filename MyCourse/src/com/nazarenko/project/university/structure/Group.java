package com.nazarenko.project.university.structure;

import com.nazarenko.project.university.lesson.Course;
import com.nazarenko.project.university.people.Student;
import com.nazarenko.project.university.people.Teacher;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Group implements Structure {
    private final String GROUP_NAME;
    private final HashSet<Student> STUDENTS = new HashSet<>();
    private Teacher groupCurator;
    private HashSet<Course> courses = new HashSet<>();

    public Group(String groupName, Department departmentOfGroup) {
        this.GROUP_NAME = groupName;
        departmentOfGroup.addGroupToDepartment(this);
        University.addGroupToUniversity(this);
    }

    String getGroupName() {
        return this.GROUP_NAME;
    }

    public void addStudentToGroup(Student newStudent) {
        this.STUDENTS.add(newStudent);
        newStudent.setGroup(this);
    }

    public void setGroupCurator(Teacher teacher) {
        this.groupCurator = teacher;
        teacher.setCurator();
    }

    public Teacher getGroupCurator() {
        return groupCurator;
    }

    private String[] listOfStudentsOfGroup() {
        String[] print = new String[STUDENTS.size()];
        int id = 0;
        for (Student student : STUDENTS) {
            print[id] = ++id + ". " + student.getFirstName();
        }
        return print;
    }

    public void addCourseToGroup(Course newCourse) {
        this.courses.add(newCourse);
        for (Student student : STUDENTS) {
            student.addCourseToStudent(newCourse);
        }
    }

    private String[] listOfCoursesOfGroup() {
        String[] print = new String[courses.size()];
        int id = 0;
        for (Course course : courses) {
            print[id] = ++id + ". " + course.getCOURSE_NAME();
        }
        return print;
    }

    @Override
    public void printStructure() {
        System.out.println("Curator of " + getGroupName() + " is: " + getGroupCurator() + ", students: \n" +
                "  " + Arrays.toString(listOfStudentsOfGroup()) + "\n" +
                "courses: " + Arrays.toString(listOfCoursesOfGroup()));
    }

    @Override
    public String toString() {
        return GROUP_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return GROUP_NAME.equals(group.GROUP_NAME) &&
                STUDENTS.equals(group.STUDENTS) &&
                Objects.equals(groupCurator, group.groupCurator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GROUP_NAME);
    }

}
