package com.nazarenko.project.university.view;

import com.nazarenko.project.university.controller.structure.UniversityController;
import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Staff;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;
import com.nazarenko.project.university.model.structure.Department;
import com.nazarenko.project.university.model.structure.Faculty;
import com.nazarenko.project.university.model.structure.Group;

public abstract class UniversityView {

    public static void printUniversityStructure() {
        System.out.println(UniversityController.getUniversityName() + " structure: ");
        UniversityView.printFacultiesOfUniversity();
        UniversityView.printDepartmentsOfUniversity();
        UniversityView.printGroupsOfUniversity();
        UniversityView.printTeachersOfUniversity();
        UniversityView.printStaffOfUniversity();
        UniversityView.printCoursesOfUniversity();
        UniversityView.printStudentsOfUniversity();
        System.out.println();
    }

    public static void printFacultiesOfUniversity() {
        System.out.print("   Faculties: ");
        int id = 0;
        for (Faculty faculty : UniversityController.getFaculties()) {
            System.out.print("\n     " + ++id + ". " + faculty.getFacultyName());
        }
        System.out.println();
    }

    public static void printDepartmentsOfUniversity() {
        System.out.print("   Departments: ");
        int id = 0;
        for (Department department : UniversityController.getDepartments()) {
            System.out.print("\n     " + ++id + ". " + department.getDepartmentName());
        }
        System.out.println();
    }

    public static void printGroupsOfUniversity() {
        System.out.print("   Groups: ");
        int id = 0;
        for (Group group : UniversityController.getGroups()) {
            System.out.print("\n     " + ++id + ". " + group.getGroupName());
        }
        System.out.println();
    }

    public static void printTeachersOfUniversity() {
        System.out.print("   Teachers: ");
        int id = 0;
        for (Teacher teacher : UniversityController.getTeachers()) {
            System.out.print("\n     " + ++id + ". " + teacher.getFirstName() + " " + teacher.getLastName() +
                    " (Academic rank:" + teacher.getAcademicRank() + ", " +
                    "SSN: " + teacher.getSOCIAL_SECURITY_NUMBER() + ")");
        }
        System.out.println();
    }

    public static void printStaffOfUniversity() {
        System.out.print("   Staff: ");
        int id = 0;
        for (Staff staff : UniversityController.getStaff()) {
            System.out.print("\n     " + ++id + ". " + staff.getFirstName() + " " + staff.getLastName() +
                    " (" + staff.getProfessionName() +
                    ", SSN: " + staff.getSOCIAL_SECURITY_NUMBER() + ")");
        }
        System.out.println();
    }

    public static void printCoursesOfUniversity() {
        System.out.print("   Courses: ");
        int id = 0;
        for (Course course : UniversityController.getCourses()) {
            System.out.print("\n     " + ++id + ". " + course.getCOURSE_NAME());
        }
        System.out.println();
    }

    public static void printStudentsOfUniversity() {
        System.out.print("   Students: ");
        int id = 0;
        for (Student student : UniversityController.getStudents()) {
            System.out.print("\n     " + ++id + ". " + student.getFirstName() + " " + student.getLastName() +
                    " (id: " + student.getStudentId() + ", SSN: " + student.getSOCIAL_SECURITY_NUMBER() + ")");
        }
        System.out.println();
    }

}
