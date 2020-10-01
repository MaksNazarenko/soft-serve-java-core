package com.nazarenko.lesson.lesson_5.homework1;

import java.util.Scanner;

public class FirstTask {

    static void firstTask() {

        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of month to see how many days in that month:\n> ");
        int month = scanner.nextInt();
        for(int i = 0; i < months.length; i++) {
            if(month == i-1) {
                month = months[i];
            }
        }
        System.out.println(month);
    }

}
