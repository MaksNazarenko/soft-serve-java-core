package com.nazarenko.project.university.controller;

import com.nazarenko.project.university.model.lesson.Course;
import com.nazarenko.project.university.model.people.Student;
import com.nazarenko.project.university.model.people.Teacher;

public abstract class Helper {

    public static boolean addGrateToStudent() {
        System.out.print("Write teacher's SSN: \n> ");
        long teacherSSN = MyScanner.scanLong();
        System.out.print("Write student's ID: \n> ");
        int studentId = MyScanner.scanInt();
        System.out.print("Write course name: \n> ");
        String courseName = MyScanner.scanLine();
        System.out.print("Write grade: \n> ");
        Float newGrade = MyScanner.scanFloat();

        Teacher teacher = MyFinder.findTeacher(teacherSSN);
        if(teacher != null) {
            Course course = MyFinder.findCourse(courseName);
            if(course != null) {
                Student student = MyFinder.findStudent(studentId);
                if(student != null) {
                    teacher.addGradeToStudent(course, student, newGrade);
                    return true;
                } else {
                    System.out.println("Couldn't find student with ID " + studentId + ".");
                }
            } else {
                System.out.println("Couldn't find course " + courseName + ".");
                return false;
            }
        } else {
            System.out.println("Couldn't find teacher with SNN " + teacherSSN + ".");
            return false;
        }
        return false;
    }

    public static boolean sortStudentGrades() {
        System.out.print("Write student's ID: \n> ");
        int studentId = MyScanner.scanInt();
        System.out.print("Write course name: \n> ");
        String courseName = MyScanner.scanLine();
        System.out.print("Write order [increasing(ascending) / decreasing (descending)]: \n> ");
        String order = MyScanner.scanLine();

        Student student = MyFinder.findStudent(studentId);
        if(student != null) {
            Course course = MyFinder.findCourse(courseName);
            if(course != null) {
                student.sortGradesInCourse(course, order);
                return true;
            } else {
                System.out.println("Couldn't find course " + courseName);
                return false;
            }
        } else {
            System.out.println("Couldn't find student with ID " + studentId + ".");
            return false;
        }
    }

    public static boolean addCourseToStudent() {
        System.out.print("Write student's ID: \n> ");
        int studentId = MyScanner.scanInt();
        System.out.print("Write course name: \n> ");
        String courseName = MyScanner.scanLine();

        Student student = MyFinder.findStudent(studentId);
        if(student != null) {
            Course course = MyFinder.findCourse(courseName);
            if(course != null) {
                student.addCourseToStudent(course);
                return true;
            } else {
                System.out.println("Couldn't find course " + courseName);
            }
        } else {
            System.out.println("Couldn't find student with ID " + studentId + ".");
        }
        return false;
    }

    public static boolean printGrades() {
        System.out.print("1 - for print all grades; 2 - for print grades by course: \n> ");
        int i = MyScanner.scanInt();
        if(i == 1) {
            Helper.allStudentGrades();
            return true;
        } else if (i == 2) {
            Helper.studentGradesOfCourse();
            return true;
        }
        return false;
    }

    public static boolean allStudentGrades(){
        System.out.print("Write student's ID: \n> ");
        int studentId = MyScanner.scanInt();

        Student student = MyFinder.findStudent(studentId);
        if(student != null) {
            student.printAllGrades();
            return true;
        } else {
            System.out.println("Couldn't find student with ID " + studentId + ".");
        }
        return false;
    }

    public static boolean studentGradesOfCourse(){
        System.out.print("Write student's ID: \n> ");
        int studentId = MyScanner.scanInt();
        System.out.print("Write course name: \n> ");
        String courseName = MyScanner.scanLine();

        Student student = MyFinder.findStudent(studentId);
        if(student != null) {
            Course course = MyFinder.findCourse(courseName);
            if(course != null) {
                student.printAllGrades();
                return true;
            } else {
                System.out.println("Couldn't find course " + courseName);
            }
        } else {
            System.out.println("Couldn't find student with ID " + studentId + ".");
        }
        return false;
    }

}
