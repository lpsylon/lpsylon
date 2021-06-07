package com.kodilla.testing.calculator;

public class Calculator {

    public int addAtoB(int a, int b) {
        return a + b;
    }

    public int substractAfromB(int a, int b) {
        return a - b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int result1 = calculator.addAtoB(3, 3);
        System.out.println(result1);
        int result2 = calculator.substractAfromB(5, 2);
        System.out.println(result2);
    }
}



