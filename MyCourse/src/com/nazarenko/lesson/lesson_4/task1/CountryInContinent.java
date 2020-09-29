/*
    3. Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
 */

package com.nazarenko.lesson.lesson_4.task1;

import java.util.Scanner;

public class CountryInContinent {

    public enum Continents {
        NORTHAMERICA, SOUTHAMERICA, EUROPA, ASIA, AFRICA, AUSTRALIA, ANTARCTICA
    }

    public static String askCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write name of a country: ");
        return scanner.nextLine();
    }

    public static void chooseContinent(String country) {

        switch (country) {
            case "USA": case "Canada": case "Mexico":
                System.out.println(country + " locates in " + Continents.NORTHAMERICA);
                break;
            case "Brazil": case "Argentina": case "Venezuela": case "Columbia":
                System.out.println(country + " locates in " + Continents.SOUTHAMERICA);
                break;
            case "Ukraine": case "Great Britain": case "Italy": case "Germany": case "French": case "Austria":
                System.out.println(country + " locates in " + Continents.EUROPA);
                break;
            case "Egypt": case "Madagascar": case "Livia": case "Congo":
                System.out.println(country + " locates in " + Continents.AFRICA);
                break;
            case "China": case "Uzbekistan": case "India": case "North Korea": case "Japan":
                System.out.println(country + " locates in " + Continents.ASIA);
                break;
            case "Australia": case "New Zealand":
                System.out.println(country + " locates in " + Continents.AUSTRALIA);
                break;
            case "Antarctica":
                System.out.println(country + " locates in " + Continents.ANTARCTICA);
                break;
            default:
                System.out.println("This one isn't in the list. Please write another country.");
        }
    }

    public static void countryInContinent() {
        String country = askCountry();
        chooseContinent(country);
    }
}
