package com.nazarenko.lesson.manager;

import java.util.Scanner;

import static com.nazarenko.lesson.description.Description.*;
import static com.nazarenko.lesson.lesson_1.homework1.L1_HW1.lesson1HomeWork1;
import static com.nazarenko.lesson.lesson_1.task1.L1_T1.lesson1Task1;
import static com.nazarenko.lesson.lesson_3.homework1.L3_HW1.lesson3HomeWork1;
import static com.nazarenko.lesson.lesson_3.task1.L3_T1.lesson3Task1;
import static com.nazarenko.lesson.lesson_4.homework1.L4_HW1.lesson4HomeWork1;
import static com.nazarenko.lesson.lesson_4.task1.L4_T1.lesson4Task1;
import static com.nazarenko.lesson.lesson_5.homework1.L4_HW1.lesson5HomeWork1;
import static com.nazarenko.lesson.lesson_5.sorting.Sorting.lesson5Sorting;
import static com.nazarenko.lesson.lesson_5.task_1.L5_T1.lesson5Task1;
import static com.nazarenko.lesson.lesson_5.triangles.Triangles.lesson5Triangles;

public class Manager {

    public static int lessonIncorrectManager() {
        System.out.println("Please, provide correct LESSON number.");
        return Integer.MIN_VALUE;
    }

    public static int lesson1Manager(int task) {
        Scanner scanner = new Scanner(System.in);
        int lesson = 1;
        while (task == Integer.MIN_VALUE) {

            lesson1TaskDescription();

            task = scanner.nextInt();
            if (task == 1) {
                lesson1Task1();
            } else if (task == 2) {
                lesson1HomeWork1();
            } else if (task == 0) {
                lesson = Integer.MIN_VALUE;
                break;
            } else {
                System.out.println("Please, provide correct TASK number.");
                task = Integer.MIN_VALUE;
            }
        }
        return lesson;
    }

    public static int lesson2Manager() {

        lesson2TaskDescription();

        return Integer.MIN_VALUE;
    }

    public static int lesson3Manager(int task) {
        Scanner scanner = new Scanner(System.in);
        int lesson = 3;
        while (task == Integer.MIN_VALUE) {

            lesson3TaskDescription();

            task = scanner.nextInt();
            if (task == 1) {
                lesson3Task1();
            } else if (task == 2) {
                lesson3HomeWork1();
            } else if (task == 0) {
                lesson = Integer.MIN_VALUE;
                break;
            } else {
                System.out.println("Please, provide correct TASK number.");
                task = Integer.MIN_VALUE;
            }
        }
        return lesson;
    }

    public static int lesson4Manager(int task) {
        Scanner scanner = new Scanner(System.in);
        int lesson = 4;
        while (task == Integer.MIN_VALUE) {

            lesson4TaskDescription();

            task = scanner.nextInt();
            if (task == 1) {
                lesson4Task1();
            } else if (task == 2) {
                lesson4HomeWork1();
            } else if (task == 0) {
                lesson = Integer.MIN_VALUE;
                break;
            } else {
                System.out.println("Please, provide correct TASK number.");
                task = Integer.MIN_VALUE;
            }
        }
        return lesson;
    }

    public static int lesson5Manager(int task) {
        Scanner scanner = new Scanner(System.in);
        int lesson = 5;
        while (task == Integer.MIN_VALUE) {

            lesson5TaskDescription();

            task = scanner.nextInt();
            if (task == 1) {
                lesson5Triangles();
            } else if (task == 2) {
                lesson5Sorting();
            } else if (task == 3) {
                lesson5Task1();
            } else if (task == 4) {
                lesson5HomeWork1();
            }
            else if (task == 0) {
                lesson = Integer.MIN_VALUE;
                break;
            } else {
                System.out.println("Please, provide correct TASK number.");
                task = Integer.MIN_VALUE;
            }
        }
        return lesson;
    }


    public static int lesson6Manager(int task) {

        lesson6TaskDescription();

        return Integer.MIN_VALUE;
    }
}
