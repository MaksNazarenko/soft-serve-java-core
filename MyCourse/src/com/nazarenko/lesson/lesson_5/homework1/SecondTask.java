package com.nazarenko.lesson.lesson_5.homework1;

import java.util.Scanner;

public class SecondTask {

    static void secondTask() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean flag = true;
        for(int i = 0; i < arr.length / 2; i++) {
            if(arr[i] < 0) {
                flag = false;
            }
        }
        int answer;
        if(flag == false) {
            answer = 1;
            for(int i = arr.length / 2; i < arr.length; i++) {
                answer *= arr[i];
            }
        } else {
            answer = 0;
            for(int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
        }
        System.out.println(answer);
    }


}
