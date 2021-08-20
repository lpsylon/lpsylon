package com.kodilla.stream.array;

import java.util.Iterator;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .mapToObj(n->numbers[n])
                .forEach((System.out::print));
        System.out.println();
        double result=IntStream.range(0,numbers.length)
                .mapToDouble(n->numbers[n])
                .average().getAsDouble();
        return result;

    }
}
