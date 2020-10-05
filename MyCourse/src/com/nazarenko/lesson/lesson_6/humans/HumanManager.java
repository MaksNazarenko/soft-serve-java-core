package com.nazarenko.lesson.lesson_6.humans;

import java.util.Scanner;

public class HumanManager {
    public static void main(String[] args) {
        System.out.println("Program starting...\n");

        manager();

        System.out.println("\nProgram ends.");
    }

    private static boolean mainMenuInfo() {
        System.out.print("Press:\n" +
                "   1 – create a group;\n" +
                "   2 – display info of all students;\n" +
                "   3 – display info of students in certain group;\n" +
                "   0 – exit.\n> ");
        return true;
    }

    private static boolean manager() {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[0];

        int operation = Integer.MIN_VALUE;
        while (operation == Integer.MIN_VALUE) {
            mainMenuInfo();
            operation = scanner.nextInt();
            if (operation == 1) {
                students = groupCreator();
                operation = Integer.MIN_VALUE;
            } else if(operation == 2) {
                displayInfoOfAllStudents(students);
                operation = Integer.MIN_VALUE;
            } else if(operation == 3) {
                displayInfoOfGroup(students);
                operation = Integer.MIN_VALUE;
            }
            else if(operation == 0) {
                break;
            } else {
                System.out.println("\nYou've provided wrong option.\n");
                operation = Integer.MIN_VALUE;
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

        System.out.println("Student successfully added.\n");
        return student;
    }

    private static Student[] groupCreator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write amount of students:\n> ");
        Student[] group = new Student[scanner.nextInt()];

        System.out.println("Input info of all students:");
        for(int i = 0; i < group.length; i++) {
            System.out.println("Adding student number " + (i + 1) + "...");
            group[i] = studentCreator();
        }
        return group;
    }

    private static boolean displayInfoOfStudent(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + ": ");
        System.out.println("    Has born in " + student.getYearOfBirth() + " year in " + student.getCountryOfBirth());
        System.out.println("    Student of " + student.getGroupNumber() + " group");
        return true;
    }

    private static boolean displayInfoOfAllStudents(Student[] group) {
        int index = 0;

        if(group.length == 0) {
            System.out.println("\nThere is no students yet. Please, add a student(-s).\n");
            return true;
        } else {
            System.out.println("Students info:");
            for (Student student : group) {
                ++index;
                System.out.print(index + ". " );
                displayInfoOfStudent(student);
            }
        }
        System.out.println("\n");
        return true;
    }

    private static boolean displayInfoOfGroup(Student[] students) {
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
        return true;
    }


}