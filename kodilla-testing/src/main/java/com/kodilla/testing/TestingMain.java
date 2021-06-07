package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        if (calculator.addAtoB(3, 3) == 6){
            System.out.println("Add function test OK");
        } else {
            System.out.println("Add function test failed");
        }
        if (calculator.substractAfromB(5, 2) == 3){
            System.out.println("Substract function test OK");
        } else {
            System.out.println("Substract function test failed");
        }
    }
}

