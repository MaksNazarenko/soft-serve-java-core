package com.nazarenko.lesson.lesson_5.task_1;

import java.util.Scanner;


import static com.nazarenko.lesson.description.Description.lesson5Task1Description;
import static com.nazarenko.lesson.lesson_5.task_1.Arrays.arrays;
import static com.nazarenko.lesson.lesson_5.task_1.EmployeeInfo.employeeInfo;

public class L5_T1 {
    public static void lesson5Task1() {
        chooseTask();
    }

    private static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        int task;

        lesson5Task1Description();

        do {
            task = scanner.nextInt();
            switch (task) {
                case 1: arrays(); break;
                case 2: employeeInfo(); break;
                default: task = 0; System.out.print("Incorrect input. Choose ones more: ");
            }
        } while(task == 0);
    }




}
