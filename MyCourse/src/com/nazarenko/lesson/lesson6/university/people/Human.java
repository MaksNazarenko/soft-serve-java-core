package com.nazarenko.lesson.lesson6.university.people;

import java.time.LocalDate;

public class Human {
    private String firstName;
    private String lastName;
    private final LocalDate YEAR_OF_BIRTH;
    private final String COUNTRY_OF_BIRTH;
    private static long countOfHumans;
    final long SOCIAL_SECURITY_NUMBER;

    Human(String firstName, String lastName, LocalDate dateOfBirth, String countryOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.YEAR_OF_BIRTH = dateOfBirth;
        this.COUNTRY_OF_BIRTH = countryOfBirth;
        this.SOCIAL_SECURITY_NUMBER = ++countOfHumans;
    }

    public String getFirstName() {
        return firstName;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getYEAR_OF_BIRTH() {
        return YEAR_OF_BIRTH;
    }

    public String getCOUNTRY_OF_BIRTH() {
        return COUNTRY_OF_BIRTH;
    }

    public long getSOCIAL_SECURITY_NUMBER() {
        return SOCIAL_SECURITY_NUMBER;
    }

}
