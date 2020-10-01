package com.nazarenko.lesson.lesson_5.homework1;

import java.util.Scanner;

public class FifthTask {

    static void fifthTask() {

        Car[] cars = carManufacture();
        displayCarByYearOfProduction(cars);
        System.out.println();
        displayCarsOrderedByYearOfProduction(cars);

    }

    private static void displayCarsOrderedByYearOfProduction(Car[] cars) {
        System.out.println("Cars in ascending order by year of production:");
        for(int i = 0; i < cars.length; i++) {
            for(int j = i+1; j < cars.length; j++) {
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()){
                    Car tmp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = tmp;
                }
            }
        }
        for (Car car : cars) {
            System.out.println("In " + car.getYearOfProduction() + " year " + car.getType() +
                    " has been developed with " + car.getEngineCapacity() + " engine capacity.");
        }

    }

    private static void displayCarByYearOfProduction(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of production:\n> ");
        int yearOfProduction = scanner.nextInt();
        System.out.println("Cars created in " + yearOfProduction + ":");
        for (Car car : cars) {
            if(yearOfProduction == car.getYearOfProduction()) {
                System.out.println(car.getType() + " with " +
                        car.getEngineCapacity() + " engine capacity.");
            }
        }
    }

    private static Car[] carManufacture() {
        Car car1 = new Car("Sedan", 2010, 100);
        Car car2 = new Car("Crossover", 2020, 50);
        Car car3 = new Car("Coupe", 2000, 150);
        Car car4 = new Car("Truck", 1990, 200);
        return new Car[]{car1, car2, car3, car4};
    }


}
