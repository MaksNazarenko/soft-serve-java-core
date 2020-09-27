package com.nazarenko.l4.t1;

import java.util.Scanner;

import static com.nazarenko.l4.t1.CountryInContinent.countryInContinent;
import static com.nazarenko.l4.t1.DayOfWeek.dayOfWeek;
import static com.nazarenko.l4.t1.OddNumbers.oddNumbers;
import static com.nazarenko.l4.t1.Product.displayProductsInfo;

public class Main {

    public static void main(String[] args) {
        chooseTask();
    }

    private static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        int task = 0;
        System.out.println("Chore one of following task:\n 1 – Find odd numbers;\n 2 – 3-language name of a day of a week;\n 3 – Continent of country;\n 4 – Info of Products.");
        do {
            task = scanner.nextInt();
            switch (task) {
                case 1: oddNumbers(); break;
                case 2: dayOfWeek(); break;
                case 3: countryInContinent(); break;
                case 4: displayProductsInfo(); break;
                default: task = 0; System.out.print("Incorrect input. Choose ones more: ");
            }
        } while(task == 0);
    }
}

/*
    1. Enter three numbers. Find out how many of them are odd.
    2. Enter the number of the day of the week. Display the name in three languages.
    3. Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
    4. Create class Product with fields name, price and quantity.
        • Create four instances of type Product.
        • Display the name and quantity of the most expensive item.
        • Display the name of the items, which has the biggest quantity.
*/