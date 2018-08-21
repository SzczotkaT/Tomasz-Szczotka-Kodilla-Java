package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer tmp : numbers) {
            if (tmp % 2 == 0) {
                evenNumbers.add(tmp);
            }
        }
        return evenNumbers;
    }
}