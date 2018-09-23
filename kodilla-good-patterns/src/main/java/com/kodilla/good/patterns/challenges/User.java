package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String lastName;
    private String addres;

    public User(String name, String lastName, String addres) {
        this.name = name;
        this.lastName = lastName;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddres() {
        return addres;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
