package com.nazarenko.lesson.description;

public class Description {
    public static void lessonsDescription() {
        System.out.println("Choose lesson number:\n" + //todo add lesson numbers options
                "   1 – Java Core Intro\n" +
                "   2 – Java Core Git\n" +
                "   3 – OOP Intro: Class, Object\n" +
                "   4 – Conditional Statements\n" +
                "   5 – Arrays. Loops.\n" +
                "Press 0 to exit.");
        System.out.print("> ");
    }
}
