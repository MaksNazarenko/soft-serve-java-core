package com.nazarenko.lesson.lesson_5.homework1;




import java.util.Scanner;

import static com.nazarenko.lesson.description.Description.lesson5HomeWork1Description;
import static com.nazarenko.lesson.lesson_5.homework1.FifthTask.fifthTask;
import static com.nazarenko.lesson.lesson_5.homework1.FirstTask.firstTask;
import static com.nazarenko.lesson.lesson_5.homework1.ForthTask.forthTask;
import static com.nazarenko.lesson.lesson_5.homework1.SecondTask.secondTask;
import static com.nazarenko.lesson.lesson_5.homework1.ThirdTask.thirdTask;


public class L4_HW1 {
    public static void lesson5HomeWork1(){
        taskManager();
    }

    private static void taskManager(){
        Scanner scanner = new Scanner(System.in);

        lesson5HomeWork1Description();

        int execute = 0;
        while(execute == 0){
            execute = scanner.nextInt();
            if(execute == 1){
                System.out.println("Start executing first task...\n\n");
                firstTask();
                System.out.println("\n\nExecution ended successfully.");
            } else if(execute == 2){
                System.out.println("Start executing second task...\n\n");
                secondTask();
                System.out.println("\n\nExecution ended successfully.");
            } else if(execute == 3){
                System.out.println("Start executing second task...\n\n");
                thirdTask();
                System.out.println("\n\nExecution ended successfully.");
            } else if(execute == 4){
                System.out.println("Start executing second task...\n\n");
                forthTask();
                System.out.println("\n\nExecution ended successfully.");
            } else if(execute == 5){
                System.out.println("Start executing second task...\n\n");
                fifthTask();
                System.out.println("\n\nExecution ended successfully.");
            } else {
                execute = 0;
            }
        }
    }


}
