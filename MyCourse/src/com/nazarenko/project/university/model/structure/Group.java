package com.nazarenko.project.university.model.structure;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;

import java.util.HashSet;
import java.util.Objects;

public class Group {
    private final String GROUP_NAME;
    private HashSet<Student> students = new HashSet<>();
    private Teacher groupCurator;
    private HashSet<Course> courses = new HashSet<>();

    public Group(String groupName, Department departmentOfGroup) {
        this.GROUP_NAME = groupName;
        departmentOfGroup.addGroupToDepartment(this);
        University.addGroupToUniversity(this);
    }

    public String getGroupName() {
        return this.GROUP_NAME;
    }

    public void addStudentToGroup(Student newStudent) {
        this.students.add(newStudent);
        newStudent.setGroup(this);
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public void setGroupCurator(Teacher teacher) {
        this.groupCurator = teacher;
        teacher.setCurator();
    }

    public Teacher getGroupCurator() {
        return groupCurator;
    }



    public void addCourseToGroup(Course newCourse) {
        this.courses.add(newCourse);
        for (Student student : students) {
            student.addCourseToStudent(newCourse);
        }
    }

    public HashSet<Course> getCourses() {
        return courses;
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
                students.equals(group.students) &&
                Objects.equals(groupCurator, group.groupCurator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GROUP_NAME);
    }

}
