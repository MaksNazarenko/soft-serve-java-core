/*
    2. Create class Dog with fields name,breed,age.
        *   Declare enum for field breed.
        *   Create 3 instances of type Dog.
        *   Check if there is no two dogs with the same name. Display the name and the kind of the oldest dog.
*/

package com.nazarenko.l4.hm1;

public class Dog {
    private String name;
    private enum breed;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }


    Dog dog = new Dog("Doggo", 4);
    Breed breed = Breed.BULLDOG;
}
