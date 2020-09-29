/*
    1. Create Console Application project in Java.
    2. Add class Employee to the project.
    3. Class Employee should consist of:
        3.1. three private fields:
            * name, rate and hours;
            * static field totalSum;
           ?* properties for access to these fields;
            * default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
        3.2. methods:
            * getSalary() - to calculate the salary of person (rate * hours)
            * toString() - to output information about employee
            * changeRate(int rate) - to change the rate of some employee and recalculate his salary
            * getBonuses() – to calculate 10% from salary
    4. In the method main() create 3 objects of Employee type. Input information about them.
    5. Display the total salary of all workers to screen
 */

package com.nazarenko.lesson.lesson_3.task1;

public class L3_T1 {

    public static void lesson3Task1() {
        System.out.println("Start program...\n");
        Employee e1 = new Employee();
        e1.name = "John";
        e1.rate = 15;
        e1.hours = 160;
        Employee e2 = new Employee("Maks", 100);
        e2.hours = 123.45f;
        Employee e3 = new Employee("Mike", 202, 28f);

        System.out.println("\nAll info of employees: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        System.out.println("\nEmployees' bonuses are following: ");
        System.out.println("- " + e1.name + " will get " + e1.getBonuses() + " UAH as a bonus!");
        System.out.println("- " + e2.name + " will get " + e2.getBonuses() + " UAH as a bonus!");
        System.out.println("- " + e3.name + " will get " + e3.getBonuses() + " UAH as a bonus!");

        System.out.println("\nLet's promote rate to John to 16 UAH per hour.");
        e1.changeRate(16);
        System.out.println("After promotion John will get " + e1.getSalary() + " UAH.");

        Employee.setTotalSum(e1.getSalary());
        Employee.setTotalSum(e2.getSalary());
        Employee.setTotalSum(e3.getSalary());
        System.out.println("\nTotal sum (w/o bonuses) to pay to employees is " + Employee.getTotalSum() + " UAH.");

        System.out.println("\n\nEnd program.");
    }

    private static class Employee {
        private String name;
        private int rate;
        private float hours;
        private static float totalSum;

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

        private float getSalary(){
            return this.hours*this.rate;
        }

        private float getBonuses(){
            return this.rate * this.hours * 0.1f;
        }

        private static void setTotalSum(float salary){
            Employee.totalSum += salary;
        }
        private static float getTotalSum(){
            return totalSum;
        }

        private void changeRate(int rate){
            this.rate = rate;
        }

        @Override //is must because toString() is claimed in java.lang.Object
        public String toString(){
            return "Name: " + this.name + "\n    Rate: " + this.rate + " UAH per hour." + "\n    Hours: " + this.hours + " hours." + "\n    Salary: " + this.rate*this.hours + " UAH.";
        }
    }
}
