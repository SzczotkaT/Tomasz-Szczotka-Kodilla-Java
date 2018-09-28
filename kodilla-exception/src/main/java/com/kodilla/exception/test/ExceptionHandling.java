package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 20);
        } catch (Exception e) {
            System.out.println("Be careful, You can't do it");
        } finally {
            System.out.println("Try or catch");
        }

    }
}

