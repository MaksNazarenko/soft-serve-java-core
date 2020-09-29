/*
* Install JDK and IDE.
* Create Java project.
* Create console application. In method main() write code for solving next tasks:
    1)  Flower bed is shaped like a circle.
        Calculate the perimeter and area by entering the radius.
        Output obtained results.

    2)  Define String variables name and address.
        Output question "What is your name?"
        Read the value name and output next question: “Where are you live, (name)?".
        Read address and write whole information.

    3)  Phone calls from three different countries are с1, с2 and с3 standard units per minute.
        Talks continued t1, t2 and t3 minutes.
        How much computer will count for each call separately and all talk together?
        Input all source data from console, make calculations and output to the screen.
*/

package com.nazarenko.lesson.lesson_1.homework1;

import java.util.Scanner;

public class L1_HW1 {

    public static void lesson1HomeWork1() {
        intro();
        taskExecutor();
    }

    /*
        1)  Flower bed is shaped like a circle.
            Calculate the perimeter and area by entering the radius.
            Output obtained results.
     */
    private static void taskFirst(){
        final float pi = 3.14159f;
        float radius = promptRadius();
        float perimeter = calculatePerimeter(pi, radius);
        float area = calculateArea(pi, radius);
        printCharacteristics(radius, perimeter, area);
    }

    private static float promptRadius() {
        System.out.println("Write radius of flower bed:");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }

    private static float calculatePerimeter(float pi, float radius) {
        return  2 * pi * radius;
    }

    private static float calculateArea(float pi, float radius) {
        return pi * radius * radius;
    }

    private static void printCharacteristics(float radius, float perimeter, float area) {
        System.out.printf("Characteristics of flower bed are following:\n1) radius is %.1f\n2) perimeter is %.1f\n3) area is %.1f%n", radius,perimeter,area);
    }

    /*
        2)  Define String variables name and address.
            Output question "What is your name?"
            Read the value name and output next question: “Where are you live, (name)?".
            Read address and write whole information.
     */
    private static void taskSecond() {
        String name = promptQuestion("What is your name?");
        String address = promptQuestion("Where are you live, " + name + "?");
        System.out.println("Nice to meet you, " + name + ". " + address + " is a good place to live.");
    }

    private static String promptQuestion(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /*
        3)  Phone calls from three different countries are с1, с2 and с3 standard units per minute.
            Talks continued t1, t2 and t3 minutes.
            How much computer will count for each call separately and all talk together?
            Input all source data from console, make calculations and output to the screen.
    */
    private static void taskThird() {
        float[] cost = new float[3];
        float[] talk = new float[3];

        System.out.println("Provide cost and length of calls:");
        for (int index = 0; index < cost.length; index++){
            cost[index] = promptCallsPrice(index, cost);
            talk[index] = promptCallsLength(index, talk);
        }
        for (int index = 0; index < cost.length; index++) {
            callsCost(index, cost, talk);
        }
        allTalkCost(cost, talk);
        }

    private static float promptCallsPrice(int index, float[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cost of call #" + (index+1) + ":");
        array[index] = Float.parseFloat(scanner.nextLine());
        return array[index];
    }

    private static float promptCallsLength(int index, float[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk length of call #" + (index+1) + ":");
        array[index] = Float.parseFloat(scanner.nextLine());
        return array[index];
    }

    private static void callsCost(int index, float[] cost, float[] talk) {
        System.out.printf("Cost of call #%d is %.2f%n", (index+1), cost[index] * talk[index] );
    }

    private static void allTalkCost(float[] cost, float[] talk) {
        float answer = 0.0f;
        for(int index = 0; index < cost.length; index++){
            answer += cost[index] * talk[index];
        }
        System.out.printf("Cost of whole talk is %.2f standard units.%n", answer);
    }

    /*
        Program intro
    */
    private static void intro(){
        System.out.println("Choose which task to execute:\n1. Calculate flower bed characteristics.\n2. Small talk.\n3. Calls expenditures.");
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
        execute task 1 or 2, if no one – re-prompt user input
    */
    private static void taskExecutor(){
        int task = taskToExecute();
        if(task == 1){
            taskFirst();
            System.out.println("Program finishes successfully.");
        } else if(task == 2){
            taskSecond();
            System.out.println("Program finishes successfully.");
        } else if(task == 3){
            taskThird();
            System.out.println("Program finishes successfully.");
        }
        else{
            System.out.println("Please, choose a task 1, 2 or 3:");
            taskExecutor();
        }
    }
}