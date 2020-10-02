package com.nazarenko.lesson.lesson_6.humans;

import java.util.Scanner;

public class HumanManager {
    public static void main(String[] args) {


        manager();






    }

    private static void manager() {
        Student[] group = new Student[0];

        Scanner scanner = new Scanner(System.in);
        int operation = Integer.MIN_VALUE;
        while (operation == Integer.MIN_VALUE) {
            System.out.print("Press 1 to create a group\n" +
                    "Pres 2 to watch info about the group\n" +
                    "Press 0 to exit\n> ");
            operation = scanner.nextInt();
            if(operation == 1) {
                group = groupCreator();
                operation = Integer.MIN_VALUE;
            } else if(operation == 2) {
                displayInfoAboutGroup(group);
                operation = Integer.MIN_VALUE;
            } else if(operation == 0) {
                break;
            } else {
                operation = Integer.MIN_VALUE;
            }
        }
    }

    private static Student studentCreator() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Write first name:\n> ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Write last name:\n> ");
        student.setLastName(scanner.nextLine());

        System.out.print("Write year of birth:\n> ");
        student.setDateOfBirth(scanner.nextInt());

        System.out.print("Write country of birth:\n> ");
        scanner.nextLine(); // get \n after .nextInt
        student.setCountryOfBirth(scanner.nextLine());

        System.out.print("Write group number:\n> ");
        student.setGroupNumber(scanner.nextInt());

        return student;
    }

    private static Student[] groupCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write amount of students:\n> ");
        Student[] group = new Student[scanner.nextInt()];
        System.out.println("Input info of all students:");
        for(int i = 0; i < group.length; i++) {
            System.out.println("Student " + (i + 1) + " is:");
            group[i] = studentCreator();
        }
        return group;
    }

    private static void displayInfoAboutGroup(Student[] group) {
        int index = 0;
        System.out.println("Group info:");
        for (Student student : group) {
            ++index;
            System.out.println(index + ". " + student.getFirstName() + " " + student.getLastName() + ": ");
            System.out.println("    Has born in " + student.getDateOfBirth() + " year in " + student.getCountryOfBirth());
            System.out.println("    Student of " + student.getGroupNumber() + " group");
        }


    }
}