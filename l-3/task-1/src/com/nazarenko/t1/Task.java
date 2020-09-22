/*
    1. Create Console Application project in Java.
    2. Add class Employee to the project.
    3. Class Employee should consist of:
        3.1. three private fields:
            * name, rate and hours;
           ?* static field totalSum
           ?* properties for access to these fields;
            * default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
        3.2. methods:
            * getSalary() - to calculate the salary of person (rate * hours)
           ?* toString() - to output information about employee
            * changeRate(int rate) - to change the rate of some employee and recalculate his salary
            * getBonuses() – to calculate 10% from salary
    4. In the method main() create 3 objects of Employee type. Input information about them.
    5. Display the total salary of all workers to screen
 */

package com.nazarenko.t1;

public class Task {

    public static void main(String[] args) {
        System.out.println("Start program...\n");
        Employee e1 = new Employee();
        e1.name = "John";
        e1.rate = 15;
        e1.hours = 160;
        Employee e2 = new Employee("Maks", 100);
        e2.hours = 123.45f;
        Employee e3 = new Employee("Mike", 202, 28f);
        System.out.println("\nSalaries of employees are following: ");
        e1.getSalary();
        e2.getSalary();
        e3.getSalary();
        System.out.println("\nAll info of employees: ");
        e1.info();
        e2.info();
        e3.info();
        System.out.println("\nEmployees' bonuses are following: ");
        e1.getBonuses();
        e2.getBonuses();
        e3.getBonuses();
        System.out.println("\nLet's promote rate to John to 16 UAH.");
        e1.changeRate(16);
        e1.getSalary();
        e1.info();
        e1.getBonuses();
        System.out.println("\n\nEnd program.");
    }

    private static class Employee {
        private String name;
        private int rate;
        private float hours;
        private static float totalSum; //to ask: what is this?

        private Employee() {} //default constructor
        private Employee(String name, int rate) {
            this.name = name;
            this.rate = rate;
        }

        private Employee(String name, int rate, float hours) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
        }

        private void getSalary(){
            System.out.println(this.name + " earns " + this.hours*this.rate + " UAH.");
        }

        private void info(){ //toString is claimed in java.lang.Object | to ask: how to create toString()?
            System.out.println("Name: " + this.name);
            System.out.println("    Rate: " + this.rate + " UAH per hour.");
            System.out.println("    Hours: " + this.hours + " hours.");
            System.out.println("    Salary: " + this.rate*this.hours + " UAH.");
        }

        private void changeRate(int rate){
            this.rate = rate;
        }

        private void getBonuses(){
            System.out.println(this.name + " will get " + this.rate*this.hours*0.1 + " UAH as a bonus!");
        }
    }
}
