package com.nazarenko.lesson.lesson6.university.structure;

import com.nazarenko.lesson.lesson6.university.people.Student;
import com.nazarenko.lesson.lesson6.university.people.Teacher;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;

public class Group implements Structure {
    private final String GROUP_NAME;
    private final ArrayList<Student> students = new ArrayList<>();
    private Teacher groupCurator;

    public Group(String groupName, Department departmentOfGroup) {
        this.GROUP_NAME = groupName;
        departmentOfGroup.addGroupToDepartment(this);
    }

    String getGroupName() {
        return this.GROUP_NAME;
    }

    public void addStudentToGroup(Student newStudent) {
        this.students.add(newStudent);
        newStudent.setGroup(this);
    }

    public void setGroupCurator(Teacher teacher) {
        this.groupCurator = teacher;
        teacher.setCurator();
    }

    private Teacher getGroupCurator() {
        return groupCurator;
    }

    private String[] listOfStudentsOfGroup() {
        String[] print = new String[students.size()];
        int id = 0;
        for (Student student : students) {
            print[id] = ++id + ". " + student.getFirstName();
        }
        return print;
    }

    @Override
    public void printStructure() {
        System.out.println("Curator of " + getGroupName() + " is: " + getGroupCurator() + ", students: \n" +
                "  " + Arrays.toString(listOfStudentsOfGroup()));
    }

    @Override
    public String toString() {
        return "Group{" +
                "GROUP_NAME='" + GROUP_NAME + '\'' +
                ", students=" + students +
                ", groupCurator=" + groupCurator +
                '}';
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
        return Objects.hash(GROUP_NAME, students, groupCurator);
    }

}
