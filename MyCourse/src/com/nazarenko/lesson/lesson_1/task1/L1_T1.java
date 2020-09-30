package com.nazarenko.lesson.lesson_1.task1;

import java.util.Scanner;

public class L1_T1 {
    public static void lesson1Task1() {
        intro();
        taskExecutor();
    }
    /*
    First task:
        Define integer variables a and b. Read values a and b from Console and calculate:
            • a+b
            • a-b
            • a*b
            • a/b.
        Output obtained results.
    */
    private static void taskFirst(){
        int a = readValue('a');
        int b = readValue('b');
        printMathOperations(a, b);
    }
    private static int readValue(char requiredValue){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write value " + requiredValue + ":");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void printMathOperations(int a, int b){
        System.out.println("1) " + a + " + " + b + " = " + (a + b));
        System.out.println("2) " + a + " - " + b + " = " +  (a - b));
        System.out.println("3) " + a + " * " + b + " = " +  (a * b));
        System.out.println("4) " + a + " / " + b + " = " +  (a / b));
    }

    /*
    Second task:
        Output question “How are you?“.
        Define string variable answer.
        Read the value answer and output: “You are (answer)".
    */
    private static void taskSecond(){
        String question = taskQuestion();
        askQuestion(question);
        String answer = readAnswer();
        printAnswer(question, answer);
    }
    private static String taskQuestion(){
        return "How are you?";
    }
    private static void askQuestion(String question){
        System.out.println(question);
    }
    private static String readAnswer(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void printAnswer(String question, String answer){
        if(question.equals(taskQuestion())){
            System.out.println("You are " + answer + ".");
        } else{
            System.out.println("Your input is: " + answer + ".");
        }
    }

    /*
    Task checker:
        ask user what task to execute
    */
    private static int taskToExecute(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    /*
    Task executor:
        execute task 1 or 2, if no one – repromt user input
    */
    private static void taskExecutor(){
        int task = taskToExecute();
        if(task == 1){
            taskFirst();
            System.out.println("Program finishes successfully.");
        } else if(task == 2){
            taskSecond();
            System.out.println("Program finishes successfully.");
        } else{
            System.out.println("Please, choose a task 1 or 2:");
            taskExecutor();
        }
    }

    /*
    Program intro
    */
    private static void intro(){
        System.out.println("Choose which task to execute:\n" +
                "1. Calculate two variables.\n" +
                "2. Ask mood.");
    }
}
