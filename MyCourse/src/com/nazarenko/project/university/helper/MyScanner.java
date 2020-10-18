package com.nazarenko.project.university.helper;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class MyScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Integer scanInt(){
        Integer returnMe = SCANNER.nextInt();
        MyScanner.scanEmptyEater(); //to eat \n after nextInt
        return returnMe;
    }

    public static Long scanLong(){
        Long returnMe = SCANNER.nextLong();
        MyScanner.scanEmptyEater(); //to eat \n after nextLong
        return returnMe;
    }

    public static Float scanFloat(){
        return SCANNER.nextFloat();
    }

    public static String scanLine(){
        return SCANNER.nextLine();
    }

    public static LocalDate scanDate(){
        return LocalDate.parse(SCANNER.nextLine());
    }

    public static void scanEmptyEater(){
        SCANNER.nextLine();
    }
}
