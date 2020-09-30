package com.nazarenko.lesson.lesson_5.sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        arraySortWithoutTmp();

        arraySortWithTmp();

    }


    private static void arraySortWithoutTmp() {
        int[] arr = arrCreator();
        printArray(arr);
        sortWithoutTmp(arr);
        printArray(arr);
    }

    private static void arraySortWithTmp() {
        int[] arr = arrCreator();
        printArray(arr);
        sortWithTmp(arr);
        printArray(arr);
    }


    private static int[] arrCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write length of array:\n> ");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println("Yor array is:");
        int index = 0;
        for (int value : arr) {
            index++;
            System.out.println(index + " –> " + value + "; ");
        }
    }

    private static void sortWithoutTmp(int[] arr) {
        System.out.println("Yor array has been sorted using bubble sort without temporary variable.");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    arr[j] += arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
            }
        }
    }

    private static void sortWithTmp(int[] arr) {
        System.out.println("Yor array has been sorted using bubble sort using temporary variable.");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if(arr[j] < arr[i]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }


}
