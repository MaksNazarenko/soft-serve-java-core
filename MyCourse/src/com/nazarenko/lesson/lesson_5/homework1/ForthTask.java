package com.nazarenko.lesson.lesson_5.homework1;

import java.util.Scanner;

public class ForthTask {

    static void forthTask() {
        int[] arr = arrayCreatorUntilNegativeNumber();
        int productOfEvenNumbers = productOfEvenNumbers(arr);
        System.out.println("Product of all entered even numbers is: " + productOfEvenNumbers);
    }

    private static int productOfEvenNumbers(int[] arr) {
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[i] % 2 == 0) {
                product *= arr[i];
            }
        }
        return product;
    }

    private static int[] arrayCreatorUntilNegativeNumber() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int currentEnteredValue;
        for(; index < arr.length; index++) {
            currentEnteredValue = scanner.nextInt();
            if(currentEnteredValue >= 0) {
                arr[index] = currentEnteredValue;
            } else {
                break;
            }
        }
        return arr;
    }


}