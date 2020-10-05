package com.nazarenko.lesson.lesson_6.humans;

public abstract class Human {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String countryOfBirth;
    private int socialSecurityNumber;

    Human(){}

    Human(String firstName, String lastName, int dateOfBirth, String countryOfBirth, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
