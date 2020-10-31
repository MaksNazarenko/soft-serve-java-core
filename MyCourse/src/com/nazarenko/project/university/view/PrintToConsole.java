package com.nazarenko.project.university.view;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;
import com.nazarenko.project.university.model.structure.Department;
import com.nazarenko.project.university.model.structure.Faculty;
import com.nazarenko.project.university.model.structure.Group;
import com.nazarenko.project.university.model.structure.University;

public class PrintToConsole {

    public static void printUniversityStructure() {
        System.out.println(University.getUniversityName() + " structure: ");
        PrintToConsole.printFacultiesOfUniversity();
        PrintToConsole.printDepartmentsOfUniversity();
        PrintToConsole.printGroupsOfUniversity();
        PrintToConsole.printStudentsOfUniversity();
        PrintToConsole.printTeachersOfUniversity();
        PrintToConsole.printStaffOfUniversity();
        PrintToConsole.printCoursesOfUniversity();
        PrintToConsole.printStudentsOfUniversity();
        System.out.println();
    }

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

    public static void printFacultiesOfUniversity() {
        System.out.print("   Faculties: ");
        int id = 0;
        if(!University.getFaculties().isEmpty()) {
            for (Faculty faculty : University.getFaculties()) {
                System.out.print("\n     " + ++id + ". " + faculty.getFacultyName());
            }
        }
        System.out.println();
    }

    public static void printDepartmentsOfUniversity() {
        System.out.print("   Departments: ");
        int id = 0;
        for (Department department : University.getDepartments()) {
            System.out.print("\n     " + ++id + ". " + department.getDepartmentName());
        }
        System.out.println();
    }

    public static void printGroupsOfUniversity() {
        System.out.print("   Groups: ");
        int id = 0;
        for (Group group : University.getGroups()) {
            System.out.print("\n     " + ++id + ". " + group.getGroupName());
        }
        System.out.println();
    }

    public static void printTeachersOfUniversity() {
        System.out.print("   Teachers: ");
        int id = 0;
        for (Teacher teacher : University.getTeachers()) {
            System.out.print("\n     " + ++id + ". " + teacher.getFirstName() + " " + teacher.getLastName() +
                    " (Academic rank:" + teacher.getAcademicRank() + ", " +
                    "SSN: " + teacher.getSOCIAL_SECURITY_NUMBER() + ")");
        }
        System.out.println();
    }

    public static void printStaffOfUniversity() {
        System.out.print("   Staff: ");
        int id = 0;
        for (Staff staff : University.getStaff()) {
            System.out.print("\n     " + ++id + ". " + staff.getFirstName() + " " + staff.getLastName() +
                    " (" + staff.getProfessionName() +
                    ", SSN: " + staff.getSOCIAL_SECURITY_NUMBER() + ")");
        }
        System.out.println();
    }

    public static void printCoursesOfUniversity() {
        System.out.print("   Courses: ");
        int id = 0;
        for (Course course : University.getCourses()) {
            System.out.print("\n     " + ++id + ". " + course.getCOURSE_NAME());
        }
        System.out.println();
    }

    public static void printStudentsOfUniversity() {
        System.out.print("   Students: ");
        int id = 0;
        for (Student student : University.getStudents()) {
            System.out.print("\n     " + ++id + ". " + student.getFirstName() + " " + student.getLastName() +
                    " (id: " + student.getStudentId() + ", SSN: " + student.getSOCIAL_SECURITY_NUMBER() + ")");
        }
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
