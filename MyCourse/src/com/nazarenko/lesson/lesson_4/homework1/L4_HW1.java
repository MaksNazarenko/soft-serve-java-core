/*
    1. Solve the next tasks:
        ▪ read 3 float numbers and check: are they all belong to the range [-5,5];
        ▪ read 3 integer numbers and write max and min of them;
        ▪ read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
    2. Create class Dog with fields name,breed,age.
        *   Declare enum for field breed.
        *    Create 3 instances of type Dog.
        *    Check if there is no two dogs with the same name. Display the name and the kind of the oldest dog.
    3. *Add Unit Tests to each task, publish code on GitHub
*/

package com.nazarenko.lesson.lesson_4.homework1;


import java.util.Scanner;

public class L4_HW1 {
    public static void lesson4HomeWork1(){
        taskManager();
    }

    private static void taskManager(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task to execute: " +
                "\n1 – Check if three values in range [-5;5]" +
                "\n2 – Check if doggos have same name and find the oldest doggo");
        int execute = 0;
        while(execute == 0){
            execute = scanner.nextInt();
            if(execute == 1){
                System.out.println("Start executing first task...\n\n");
                FirstTask.firstTask();
                System.out.println("\n\nExecution ended successfully.");
            } else if(execute == 2){
                System.out.println("Start executing second task...\n\n");
                Dog.secondTask();
                System.out.println("\n\nExecution ended successfully.");
            } else {
                execute = 0;
            }
        }
    }
}
