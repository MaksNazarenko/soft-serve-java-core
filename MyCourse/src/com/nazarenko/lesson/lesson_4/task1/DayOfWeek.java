/*
    2. Enter the number of the day of the week. Display the name in three languages.
*/

package com.nazarenko.lesson.lesson_4.task1;

import java.util.Scanner;

public class DayOfWeek {
    public enum day {
        MONDAY("MONDAY", "LUNDI", "ПОНЕДІЛОК"), TUESDAY("TUESDAY", "MARDI", "ВІВТОРОК"),
        WEDNESDAY("WEDNESDAY", "MERCREDI", "СЕРЕДА"), THURSDAY("THURSDAY", "JEUDI", "ЧЕТВЕР"),
        FRIDAY("FRIDAY", "VENDREDI", "П'ЯТНИЦЯ"), SATURDAY("SATURDAY", "SAMEDI", "СУБОТА"),
        SUNDAY("SUNDAY", "DIMANCHE", "НЕДІЛЯ");

        private final String en;
        private final String fr;
        private final String ua;

        day(String en, String fr, String ua) {
            this.en = en;
            this.fr = fr;
            this.ua = ua;
        }

        public String getEn() {
            return en;
        }

        public String getFr() {
            return fr;
        }

        public String getUa() {
            return ua;
        }

        public String getAll() {
            return getEn() + " " + getFr() + " " + getUa();
        }
    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number of a day of a week: ");
        int enteredDay = scanner.nextInt();
        if(enteredDay == 1) {
            DayOfWeek.day day = DayOfWeek.day.MONDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 2) {
            DayOfWeek.day day = DayOfWeek.day.TUESDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 3) {
            DayOfWeek.day day = DayOfWeek.day.WEDNESDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 4) {
            DayOfWeek.day day = DayOfWeek.day.THURSDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 5) {
            DayOfWeek.day day = DayOfWeek.day.FRIDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 6) {
            DayOfWeek.day day = DayOfWeek.day.SATURDAY;
            System.out.println(day.getAll());
        } else if (enteredDay == 7) {
            DayOfWeek.day day = DayOfWeek.day.SUNDAY;
            System.out.println(day.getAll());
        }
    }
}
