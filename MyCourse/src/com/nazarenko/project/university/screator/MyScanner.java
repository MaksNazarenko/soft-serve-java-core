package com.nazarenko.project.university.screator;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class MyScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Integer scanInt(){
        return SCANNER.nextInt();
    }

    public static Long scanLong(){
        return SCANNER.nextLong();
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
