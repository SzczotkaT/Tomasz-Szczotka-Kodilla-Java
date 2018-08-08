package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator myCalc = new Calculator(10,20);

        int resultAdd = myCalc.add();
        int resultDis = myCalc.subtract();

        if (resultAdd > 10){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (resultDis < 10){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}


















