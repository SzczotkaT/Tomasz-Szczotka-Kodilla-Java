package com.kodilla;

public class Student {
    String firstName;
    String lastName;
    Integer id;

    public Student(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        final Student s = (Student) o;
        return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName) && this.id.equals(s.id);
    }
    @Override
    public int hashCode() {
        return this.id;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + id + " :";
    }
}
