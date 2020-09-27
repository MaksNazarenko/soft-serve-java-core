/*
    1. Enter three numbers. Find out how many of them are odd.
*/

package com.nazarenko.l4.t1;

import java.util.Scanner;

public class OddNumbers {

    public static int findOdd(int ...value){
        int odd = 0;
        for (int val : value) {
            if(val % 2 == 0){
                odd++;
            }
        }
        return odd;
    }

    public static void oddNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three numbers:");
        System.out.print("First = ");
        int a = scanner.nextInt();
        System.out.print("Second = ");
        int b = scanner.nextInt();
        System.out.print("Third = ");
        int c = scanner.nextInt();
        int odd = findOdd(a,b,c);
        System.out.println(odd + " entered value(s) is(are) odd.");
    }
}
