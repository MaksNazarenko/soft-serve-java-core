package com.nazarenko.lesson.lesson_5.task_1;

import java.util.Scanner;

public class Arrays {
    static void arrays() {
        int[] arr = arrayCreator();
        System.out.println("Biggest number of your array is: " + biggestNumberOfArray(arr));
        System.out.println("Positive numbers sum is: " + positiveNumberSumOfArray(arr));
        int amountOfPositiveValues = amountOfPositiveNumbersInArray(arr);
        int amountOfNegativeValues = amountOfNegativeNumbersInArray(arr);
        System.out.println("Negative numbers amount is: " + amountOfNegativeValues);
        String moreValues = whatValuesMore(amountOfPositiveValues, amountOfNegativeValues);
        System.out.println(moreValues);
    }

    private static String whatValuesMore(int amountOfPositiveValues, int amountOfNegativeValues) {
        String amount;
        if(amountOfPositiveValues > amountOfNegativeValues) {
            amount = "Amount of positive values in an array more than negative.";
        } else if(amountOfPositiveValues < amountOfNegativeValues) {
            amount = "Amount of negative values in an array more than positive.";
        } else {
            amount = "Amount of negative and positive values is the same.";
        }
        return amount;
    }


    private static int amountOfPositiveNumbersInArray(int[] arr) {
        int positiveNumbersAmount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positiveNumbersAmount++;
            }
        }
        return positiveNumbersAmount;
    }

    private static int amountOfNegativeNumbersInArray(int[] arr) {
        int negativeNumbersAmount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                negativeNumbersAmount++;
            }
        }
        return negativeNumbersAmount;
    }

    private static int positiveNumberSumOfArray(int[] arr) {
        int sumOfPositiveNumber = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sumOfPositiveNumber += arr[i];
            }
        }
        return sumOfPositiveNumber;
    }

    private static int biggestNumberOfArray(int[] arr) {
        int biggestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(biggestNumber < arr[i]) {
                biggestNumber = arr[i];
            }
        }
        return biggestNumber;
    }

    private static int[] arrayCreator() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("You've initialize an array of length 10.");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Write element " + (i+1) + " of an array:\n> ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
