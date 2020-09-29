/*
    1. Create Console Application project in Java.
    2. Add class Person to the project.
    3. Class Person should consist of
        a) three private fields: firstName, lastName and birthYear (the birthday year)
       ?b) properties for access to these fields //what is properties to access?
        c) default constructor and constructor with 2 parameters (first and last names)
        d) methods:
            • getAge() - to calculate the age of person
            • input() - to input information about person
            • output() - to output information about person
            • changeName(String fn, String fn) - to change the first name or/and last name of person
    4. In the method main() create 5 objects of Person type and input information about them.
 */
package com.nazarenko.lesson.lesson_3.homework1;

public class L3_HW1 {

    public static void lesson3HomeWork1() {
        System.out.println("Program starting...\n");

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Maks", "Nazarenko");
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p1.setBirthYear(1995);
        p2.setBirthYear(1996);
        p3.input("Mike", "Dzihovskyi", 2020);
        p4.changeName("Bob");
        p4.changeLastName("Big");
        p4.setBirthYear(1997);
        p5.changeName("Kate", "Any");
        p5.setBirthYear(1998);

        System.out.println("Using method getAge() to John we can see that John was born in " + p1.getAge() +".\n");

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();

        System.out.println("\nEnd program.");
    }

    private static class Person{
        private String firstName;
        private String lastName;
        private int birthYear;

        private Person(){}
        private Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        private void setBirthYear(int birthYear){
            this.birthYear = birthYear;
        }

        private int getAge(){
            return this.birthYear;
        }

        private void input(String firstName, String lastName, int birthYear){
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }

        private void output(){
            System.out.println("This is a " + firstName + " " + lastName + ". He was born in " + birthYear + ".");
        }

        private void changeName(String fn){
            this.firstName = fn;
        }
        private void changeName(String fn, String ln){
            this.firstName = fn;
            this.lastName = ln;
        }
        private void changeLastName(String ln){
            this.lastName = ln;
        }
    }
}
