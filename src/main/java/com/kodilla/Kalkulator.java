package com.kodilla;

public class Kalkulator {
    public static void main(String[] args){

        Calculator cal = new Calculator(10, 5);

        System.out.println(cal.add());
        System.out.println(cal.subtract());
    }
}
