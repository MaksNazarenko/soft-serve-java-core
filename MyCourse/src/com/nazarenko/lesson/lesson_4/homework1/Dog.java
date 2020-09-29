/*
    2. Create class Dog with fields name,breed,age.
        *   Declare enum for field breed.
        *   Create 3 instances of type Dog.
        *   Check if there is no two dogs with the same name. Display the name and the kind of the oldest dog.
*/

package com.nazarenko.lesson.lesson_4.homework1;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    Dog(String name, int age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }



    private static Dog oldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldestDog = dog1.getAge() > dog2.getAge() ? dog1 : dog2;
        oldestDog = oldestDog.getAge() > dog3.getAge() ? oldestDog : dog3;
        return oldestDog;
    }

    private static void nameChecker(Dog dog1, Dog dog2, Dog dog3){
        if(dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog3.getName().equals(dog1.getName())) {
            System.out.println("Some doggos have the same name.");
        } else {
            System.out.println("Doggos haven't the same name.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static void secondTask(){
        Dog dog1 = new Dog("Doggo", 3, Breed.DVORNIAGA);
        Dog dog2 = new Dog("Big Boss", 1, Breed.CHIHUAHUA);
        Dog dog3 = new Dog("Fighter", 2, Breed.BULLDOG);
        nameChecker(dog1, dog2, dog3);
        Dog oldestDog = oldestDog(dog1, dog2, dog3);
        System.out.println("Name of the oldest dog is: " + oldestDog.getName() + " and kind is " + oldestDog.getBreed() + ".");
    }

    public Breed getBreed() {
        return breed;
    }
}
