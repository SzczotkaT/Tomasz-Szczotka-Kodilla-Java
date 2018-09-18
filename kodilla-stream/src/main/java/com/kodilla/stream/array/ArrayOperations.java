package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static Double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .forEach(System.out::println);

        double arrayAverage = IntStream.range(0,numbers.length)
                .mapToDouble(n->numbers[n])
                .average()
                .getAsDouble();

        return arrayAverage;
    }
}
