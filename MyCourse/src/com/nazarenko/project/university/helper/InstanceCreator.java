package com.nazarenko.project.university.helper;

import com.nazarenko.project.university.lesson.Course;
import com.nazarenko.project.university.lesson.LessonsList;
import com.nazarenko.project.university.people.Staff;
import com.nazarenko.project.university.people.Student;
import com.nazarenko.project.university.people.Teacher;
import com.nazarenko.project.university.structure.Department;
import com.nazarenko.project.university.structure.Faculty;
import com.nazarenko.project.university.structure.Group;
import com.nazarenko.project.university.structure.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public abstract class InstanceCreator {

    public static Student createStudent(){
//        System.out.print("Write student's first name: \n> ");
//        String firstName = MyScanner.scanLine();
//        System.out.print("Write student's last name: \n> ");
//        String lastName = MyScanner.scanLine();
//        System.out.print("Country of birth: \n> ");
//        String countryOfBirth = MyScanner.scanLine();
        HashMap<String, String> info = InstanceCreator.getInfoFromConsole("student");
        System.out.print("Date of birth [yyyy-mm-dd]: \n> ");
        LocalDate dateOfBirth = MyScanner.scanDate();
        return new Student(info.get("firstName"), info.get("lastName"), dateOfBirth, info.get("countryOfBirth"));
    }

    public static Teacher createTeacher(){
        System.out.print("Write teacher's first name: \n> ");
        String firstName = MyScanner.scanLine();
        System.out.print("Write teacher's last name: \n> ");
        String lastName = MyScanner.scanLine();
        System.out.print("Date of birth [yyyy-mm-dd]: \n> ");
        LocalDate dateOfBirth = MyScanner.scanDate();
        System.out.print("Country of birth: \n> ");
        String countryOfBirth = MyScanner.scanLine();
        System.out.print("Onboarded date [yyyy-mm-dd]: \n> ");
        LocalDate hireDate = MyScanner.scanDate();
        System.out.print("Salary rate: \n> ");
        Float salaryRate = MyScanner.scanFloat();
        return new Teacher(firstName, lastName, dateOfBirth, countryOfBirth, hireDate, salaryRate);
    }

    public static Staff createStaff(){
        System.out.print("Write staff's first name: \n> ");
        String firstName = MyScanner.scanLine();
        System.out.print("Write staff's last name: \n> ");
        String lastName = MyScanner.scanLine();
        System.out.print("Date of birth [yyyy-mm-dd]: \n> ");
        LocalDate dateOfBirth = MyScanner.scanDate();
        System.out.print("Country of birth: \n> ");
        String countryOfBirth = MyScanner.scanLine();
        System.out.print("Onboarded date [yyyy-mm-dd]: \n> ");
        LocalDate hireDate = MyScanner.scanDate();
        System.out.print("Salary rate: \n> ");
        Float salaryRate = MyScanner.scanFloat();
        System.out.print("Profession name: \n> ");
        String professionName = MyScanner.scanLine();
        return new Staff(firstName, lastName, dateOfBirth, countryOfBirth, hireDate, salaryRate, professionName);
    }

    private static HashMap<String, String> getInfoFromConsole(String arg) {
        HashMap<String, String> humanInfo = new HashMap<>();
        System.out.print("Write " + arg + "'s first name: \n> ");
        humanInfo.put("firstName", MyScanner.scanLine());
        System.out.print("Write " + arg + "'s last name: \n> ");
        humanInfo.put("lastName", MyScanner.scanLine());
        System.out.print("Country of birth: \n> ");
        humanInfo.put("countryOfBirth", MyScanner.scanLine());
        return humanInfo;
    }

    public static Faculty createFaculty(){
        System.out.print("Write faculty's name: \n> ");
        String facultyName = MyScanner.scanLine();
        return new Faculty(facultyName);
    }

    public static Department createDepartment() {
        System.out.print("Write department's name: \n> ");
        String departmentName = MyScanner.scanLine();
        System.out.print("Write faculty's name: \n> ");
        String facultyName = MyScanner.scanLine();

        HashSet<Faculty> faculties = University.getFaculties();
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyName().equals(facultyName)) {
                return new Department(departmentName, faculty);
            }
        }
        return new Department(departmentName, new Faculty(facultyName));
    }

    public static Group createGroup() {
        System.out.print("Write group's name: \n> ");
        String grouptName = MyScanner.scanLine();
        System.out.print("Write department's name: \n> ");
        String departmentName = MyScanner.scanLine();

        HashSet<Faculty> faculties = University.getFaculties();
        for (Faculty faculty : faculties) {
            HashSet<Department> departments = faculty.getDepartments();
            for (Department department : departments) {
                if (department.getDepartmentName().equals(departmentName)) {
                    return new Group(grouptName, department);
                }
            }
        }
        System.out.println("You want to add a new department, please write in which faculty or create a new one.");
        return new Group(grouptName, new Department(departmentName, createFaculty()));
    }

    public static Course createCourse(){
        System.out.print("Write courses' name: \n> ");
        String courseName = MyScanner.scanLine();
        System.out.print("Choose one of next lessons: " + Arrays.toString(LessonsList.values()) + " \n> ");
        String lessonString = MyScanner.scanLine();
        LessonsList lessonName = LessonsList.valueOf(lessonString); //todo add exception handler for enum
        System.out.print("Write SSN of lecturer: \n> ");
        Long lecturesSSN = MyScanner.scanLong();

        ArrayList<Teacher> teachers = University.getTeachers();
        for (Teacher teacher : teachers) {
            if(teacher.getSOCIAL_SECURITY_NUMBER() == lecturesSSN) {
                return new Course(courseName, lessonName, teacher);
            }
        }
        System.out.println("RUN doesn't have this teacher, please create a new one.");
        return new Course(courseName, lessonName, createTeacher());
    }

}
