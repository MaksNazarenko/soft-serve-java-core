package com.nazarenko.lesson.lesson6.university;

import com.nazarenko.lesson.lesson6.university.people.Student;

import java.util.Scanner;

public class MyUniversity {

    static final String MAIN_MENU = "Press:\n" +
            "   1 – create students list;\n" +
            "   2 – display info of all students;\n" +
            "   3 – display info of students in certain group;\n" +
            "   0 – exit.\n> ";

    public static void main(String[] args) {
        System.out.println("Program starting...\n");

        manager();

        System.out.println("\nProgram ends.");
    }

    private static boolean manager() {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[0];

        while (true) {
            System.out.print(MAIN_MENU);
            int operation = scanner.nextInt();
            if (operation == 1) {
                students = groupCreator();
            } else if(operation == 2) {
                displayInfoOfAllStudents(students);
            } else if(operation == 3) {
                displayInfoOfGroup(students);
            }
            else if(operation == 0) {
                break;
            } else {
                System.out.println("\nYou've provided wrong option.\n");
            }
        }
        return true;
    }

    private static Student studentCreator() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("First name:\n> ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Last name:\n> ");
        student.setLastName(scanner.nextLine());

        System.out.print("Year of birth:\n> ");
        student.setYearOfBirth(scanner.nextInt());

        System.out.print("Country of birth:\n> ");
        scanner.nextLine(); // to take \n after .nextInt
        student.setCountryOfBirth(scanner.nextLine());

        System.out.print("Group number:\n> ");
        student.setGroupNumber(scanner.nextInt());

        System.out.print("Students' grades:\n> ");
        scanner.nextLine();
        student.addGrade(scanner.nextInt());

        System.out.println("Student successfully added.\n");
        return student;
    }

    private static Student[] groupCreator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write amount of students:\n> ");
        Student[] students = new Student[scanner.nextInt()];

        System.out.println("Input info of all students:");
        for(int i = 0; i < students.length; i++) {
            System.out.println("Adding student number " + (i + 1) + "...");
            students[i] = studentCreator();
        }
        return students;
    }

    private static boolean displayInfoOfStudent(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + ": ");
        System.out.println("    Has born in " + student.getYearOfBirth() + " year in " + student.getCountryOfBirth());
        System.out.println("    Student of " + student.getGroupNumber() + " group");
        System.out.println("Grades: " + student.getGrades());
        return true;
    }

    private static void displayInfoOfAllStudents(Student[] group) {
        int index = 0;

        if(group.length == 0) {
            System.out.println("\nThere is no students yet. Please, add a student(-s).\n");
        } else {
            System.out.println("Students info:");
            for (Student student : group) {
                ++index;
                System.out.print(index + ". " );
                displayInfoOfStudent(student);
            }
        }
        System.out.println("\n");
    }

    private static void displayInfoOfGroup(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Student[] group = new Student[students.length];

        System.out.print("Write number of a group to display students of it:\n> ");
        int groupNumber = scanner.nextInt();
        int index = 1;
        for (Student student : students) {
            if(student.getGroupNumber() == groupNumber) {
                System.out.print(index + ". ");
                displayInfoOfStudent(student);
                index++;
            }
        }
        System.out.println("\n");
    }


}