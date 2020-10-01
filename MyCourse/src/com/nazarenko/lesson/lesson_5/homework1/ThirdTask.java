package com.nazarenko.lesson.lesson_5.homework1;

import java.util.Scanner;

public class ThirdTask {

    static void thirdTask() {

        int[] arr = arrayCreator();
        System.out.println(secondPositiveNumber(arr));
        minimumAnsItsPosition(arr);

    }

    private static int[] arrayCreator() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int secondPositiveNumber(int[] arr) {
        int position = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                position++;
                if(position == 2) {
                    break;
                }
            }
        }
        return position;
    }

    private static void minimumAnsItsPosition(int[] arr) {
        int minimum = minimumOfArray(arr);
        int positionOfMinimum = positionOfMinimum(arr, minimum);
        System.out.println("Minimum in array is: " + minimum + ".");
        System.out.println("Position of minimum is: " + (positionOfMinimum - 1) + ".");
    }

    private static int positionOfMinimum(int[] arr, int minimum) {
        int position = 0;
        for(int i = 0; i < arr.length; i++) {
            if(minimum == arr[i]) {
                position = i;
                break;
            }
        }
        return position;
    }

    private static int minimumOfArray(int[] arr) {
        int minimum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
