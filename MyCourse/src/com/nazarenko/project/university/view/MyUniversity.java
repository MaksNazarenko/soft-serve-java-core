package com.nazarenko.project.university.view;

import com.nazarenko.project.university.controller.ProjectManager;

public class MyUniversity {

    public static void main(String[] args) {
        System.out.println("Welcome to Royal University of Nazarenko!\n");

        ProjectManager.manager();

        System.out.println("\nWill see you in future!");
    }
}