package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator{

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    evenNumbers.add(numbers.get(i));
                }
            }
            for (int i = 0; i < evenNumbers.size(); i++) {
                System.out.println(evenNumbers.get(i));
            }

        }
        return evenNumbers;
    }
}