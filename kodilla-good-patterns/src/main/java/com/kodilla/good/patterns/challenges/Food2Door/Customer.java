package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDay;

    public Customer(String name, String lastname, LocalDate birthDay) {
        this.name = name;
        this.lastName = lastname;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
