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


package com.nazarenko.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
    }

/*
    1)  Flower bed is shaped like a circle.
        Calculate the perimeter and area by entering the radius.
        Output obtained results.
 */
    private static void taskOne(){
        final float pi = 3.14159f;
        float radius = promptRadius();
        float perimeter = calculatePerimeter(pi, radius);
        float area = calculateArea(pi, radius);
        printCharacteristics(radius, perimeter, area);
    }

    private static float promptRadius() {
        System.out.println("Write radius of flower bed:");
        Scanner scanner = new Scanner(System.in);
        float radius = Float.parseFloat(scanner.nextLine());
        return radius;
    }

    private static float calculatePerimeter(float pi, float radius) {
        return  2 * pi * radius;
    }

    private static float calculateArea(float pi, float radius) {
        return pi * radius * radius;
    }

    private static void printCharacteristics(float radius, float perimeter, float area) {
        System.out.println(String.format("Characteristics of flower bed are following:\n1) radius is %.1f\n2) perimeter is %.1f\n3) area is %.1f", radius,perimeter,area));
    }
}
