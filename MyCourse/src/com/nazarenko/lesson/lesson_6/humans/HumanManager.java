package com.nazarenko.lesson.lesson_6.humans;

import java.util.Scanner;

public class HumanManager {
    public static void main(String[] args) throws InterruptedException {

        Student[] group = groupCreator();


        //Student student1 = studentCreator();

    }

    private static Student studentCreator() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Write first name:\n> ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Write last name:\n> ");
        student.setLastName(scanner.nextLine());

        System.out.print("Write year of birth:\n> ");
        student.setDateOfBirth(scanner.nextInt());

        System.out.print("Write country of birth:\n> ");
        Thread.sleep(1000);
        student.setCountryOfBirth(scanner.nextLine()); // .nextLine -> doesn't work || .next -> works
        Thread.sleep(1000);

        System.out.print("Write group number:\n> ");
        student.setGroupNumber(scanner.nextInt());

        return student;
    }

    private static Student[] groupCreator() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write amount of students:\n> ");
        Student[] group = new Student[scanner.nextInt()];
        for(int i = 0; i < group.length; i++) {
            group[i] = studentCreator();
        }
        return group;
    }

    private static void displayInfoAboutGroup(Student[] group) {
        
    }
}