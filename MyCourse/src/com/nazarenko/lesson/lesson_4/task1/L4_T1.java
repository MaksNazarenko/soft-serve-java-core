/*
    1. Enter three numbers. Find out how many of them are odd.
    2. Enter the number of the day of the week. Display the name in three languages.
    3. Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
    4. Create class Product with fields name, price and quantity.
        • Create four instances of type Product.
        • Display the name and quantity of the most expensive item.
        • Display the name of the items, which has the biggest quantity.
*/

package com.nazarenko.lesson.lesson_4.task1;

import java.util.Scanner;

import static com.nazarenko.lesson.description.Description.lesson4Task1Description;
import static com.nazarenko.lesson.lesson_4.task1.CountryInContinent.countryInContinent;
import static com.nazarenko.lesson.lesson_4.task1.DayOfWeek.dayOfWeek;
import static com.nazarenko.lesson.lesson_4.task1.OddNumbers.oddNumbers;

public class L4_T1 {

    public static void lesson4Task1() {
        chooseTask();
    }

    private static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        int task;

        lesson4Task1Description();

        do {
            task = scanner.nextInt();
            switch (task) {
                case 1: oddNumbers(); break;
                case 2: dayOfWeek(); break;
                case 3: countryInContinent(); break;
                case 4: Product.displayProductsInfo(); break;
                default: task = 0; System.out.print("Incorrect input. Choose ones more: ");
            }
        } while(task == 0);
    }
}