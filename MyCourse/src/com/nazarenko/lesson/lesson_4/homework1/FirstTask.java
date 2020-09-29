/*
    1. Solve the next tasks:
        ▪ read 3 float numbers and check: are they all belong to the range [-5,5];
        ▪ read 3 integer numbers and write max and min of them;
        ▪ read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
*/

package com.nazarenko.lesson.lesson_4.homework1;

import java.util.Scanner;

public class FirstTask {

    static void firstTask(){
        System.out.println("Enter three values to check if all of them are in range [-5,5]:");
        float f1 = floatCreator();
        float f2 = floatCreator();
        float f3 = floatCreator();
        inRangeChecker(f1, f2, f3);
    }
    private static float floatCreator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        return scanner.nextFloat();
    }

    private static void inRangeChecker(float f1, float f2, float f3){
        final float rangeMin = -5.0f;
        final float rangeMax = 5.0f;
        if(rangeMin <= f1 && f1 <= rangeMax) {
            if(rangeMin <= f2 && f2 <= rangeMax) {
                if (rangeMin <= f3 && f3 <= rangeMax) {
                    System.out.println(rangeMin + " <= " + f1 + " & " + f2 + " & " + f3 + " <= " + rangeMax);
                    System.out.println("All values are in range " + "[" + rangeMin + "," + rangeMax + "].");
                } else {
                    System.out.println("All values aren't in range " + "[" + rangeMin + "," + rangeMax + "].");
                }
            }
        }
    }
}
