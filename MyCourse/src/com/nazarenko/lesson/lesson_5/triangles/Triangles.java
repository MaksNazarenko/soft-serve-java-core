package com.nazarenko.lesson.lesson_5.triangles;

import java.util.Scanner;

import static com.nazarenko.lesson.description.Description.*;

public class Triangles {

    public static void lesson5Triangles() {
        chooseTask();
    }

    private static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        int task;

        lesson5TrianglesDescription();

        do {
            task = scanner.nextInt();
            switch (task) {
                case 1: rightTriangleSideLeftTopDown(); break;
                case 2: rightTriangleSideRightTopDown(); break;
                case 3: rightTriangleSideLeftBottomTop(); break;
                case 4: rightTriangleSideRightBottomTop(); break;
                case 5: flag(); break;
                case 6: flagReverse(); break;
                case 7: equilateralTriangle(); break;
                case 8: equilateralTriangleReverse(); break;
                case 9: christmasThree(); break;
                case 10: christmasThreeReverse(); break;
                default: task = 0; System.out.print("Incorrect input. Choose ones more: ");
            }
        } while(task == 0);
    }


    private static void rightTriangleSideLeftTopDown() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangleSideRightTopDown() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int s = height+1; s > i; s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangleSideLeftBottomTop() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i = 0; i < height; i++) {
            for (int j = height - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void rightTriangleSideRightBottomTop() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i = 0; i < height; i++) {
            for(int s = height + i; s > height; s--){
                System.out.print(" ");
            }
            for(int j = height - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void flag() {
        System.out.println("Write height of flag:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        int middle = height / 2 + 1;
        for(int i = 0; i < height; i++) {
            if(i < middle) {
                for(int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            } else {
                for(int s = height - i; s > 0; s--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    private static void flagReverse() {
        System.out.println("Write height of flag:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        int middle = height / 2 + 1;
        for (int i = 0; i < height; i++) {
            if (i < middle) {
                for (int j = middle - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int s = middle - i - 1; s < middle; s++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int q = i - middle + 1; q > 0; q--) {
                    System.out.print(" ");
                }
                for (int q = i - middle + 1; q < middle; q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    private static void equilateralTriangle() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for(int i = 0; i < height; i++) {
            for(int j = 1; j < height - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void equilateralTriangleReverse() {
        System.out.println("Write height of triangle:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = height - i - 1; j < height; j++) {
                System.out.print(" ");
            }
        }
    }

    private static void christmasThree() {
        System.out.println("Write height of biggest branch:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        int bottomBranch = height;
        int middleBranch = height / 2;
        int topBranch = height / 4;

        for(int i = 0; i < topBranch; i++) {
            for(int b = 0; b < middleBranch + topBranch; b++) {
                System.out.print(" ");
            }
            for(int j = 1; j < topBranch - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = height/6; i < middleBranch; i++) {
            for(int b = 0; b < middleBranch; b++) {
                System.out.print(" ");
            }
            for(int j = 1; j < middleBranch - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = height/3; i < bottomBranch; i++) {
            for(int j = 1; j < bottomBranch - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void christmasThreeReverse() {
        System.out.println("Write height of biggest branch:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        int bottomBranch = height;
        int middleBranch = height / 2;
        int topBranch = height / 4;

        for (int i = 0; i < bottomBranch; i++) {
            for (int j = 0; j < bottomBranch - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = bottomBranch - i - 1; j < bottomBranch; j++) {
                System.out.print(" ");
            }
        }
        System.out.print("\r");
        for (int i = 0; i < middleBranch; i++) {
            for(int b = 0; b < middleBranch; b++) {
                System.out.print(" ");
            }
            for (int j = 0; j < middleBranch - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = middleBranch - i - 1; j < middleBranch; j++) {
                System.out.print(" ");
            }
        }
        System.out.print("\r");
        for (int i = 0; i < topBranch; i++) {
            for(int b = 0; b < middleBranch + topBranch; b++) {
                System.out.print(" ");
            }
            for (int j = 0; j < topBranch - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = topBranch - i - 1; j < topBranch; j++) {
                System.out.print(" ");
            }
        }
    }

}