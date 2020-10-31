package com.nazarenko.project.university.view;

import com.nazarenko.project.university.controller.structure.UniversityController;
import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;
import com.nazarenko.project.university.model.structure.Department;
import com.nazarenko.project.university.model.structure.Faculty;
import com.nazarenko.project.university.model.structure.Group;

public abstract class PrintToConsole {



    public static void printFacultyStructure(Faculty faculty) {
        System.out.println("Departments of " + faculty.getFacultyName() + ":\n");
        PrintToConsole.printDepartmentsOfFaculty(faculty);
        System.out.println();
    }

    public static void printDepartmentStructure(Department department) {
        System.out.println("Groups of " + department.getDepartmentName() + ":\n");
        PrintToConsole.printGroupsOfDepartment(department);
        System.out.println();
    }

    public static void printGroupStructure(Group group) {
        System.out.println("Curator of " + group.getGroupName() + " is: " + group.getGroupCurator() + ", ");
        PrintToConsole.printStudentsOfGroup(group);
        PrintToConsole.printCoursesOfGroup(group);
        System.out.println();
    }



    public static void printDepartmentsOfFaculty(Faculty faculty) {
        int id = 0;
        for (Department department : faculty.getDepartments()) {
            System.out.print("\n     " + ++id + ". " + department.getDepartmentName());
        }
    }

    public static void printGroupsOfDepartment(Department department) {
        int id = 0;
        for (Group group : department.getGroups()) {
            System.out.print("\n     " + ++id + ". " + group.getGroupName());
        }
    }

    public static void printStudentsOfGroup(Group group) {
        System.out.print("   Students: ");
        int id = 0;
        for (Student student : group.getStudents()) {
            System.out.print("\n     " + ++id + ". " + student.getFirstName());
        }
    }

    public static void printCoursesOfGroup(Group group) {
        System.out.print("   Courses: ");
        int id = 0;
        for (Course course : group.getCourses()) {
            System.out.print("\n     " + ++id + ". " + course.getCOURSE_NAME());
        }
    }

}
