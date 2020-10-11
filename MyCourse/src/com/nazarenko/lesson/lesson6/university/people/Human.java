package com.nazarenko.lesson.lesson6.university.people;

import java.time.LocalDate;
import java.util.Date;

public abstract class Human {
    private String firstName;
    private String lastName;
    private LocalDate yearOfBirth;
    private String countryOfBirth;
    private int socialSecurityNumber;

    Human(){}

    Human(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth, int socialSecurityNumber) {
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

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
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
