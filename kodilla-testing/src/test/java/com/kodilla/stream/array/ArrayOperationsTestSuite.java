package com.kodilla.stream.array;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Array Operation Test Suite")
public class ArrayOperationsTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Test for Array")
    class TestArray {
        @DisplayName("when create array numbers with numbers, " +
                "then getAverage should return average number of numbers")
        @Test
        void testGetAverage() {
            //Given
            int[] numbers = new int[]{1,7,9,13};

            //When
            double result=ArrayOperations.getAverage(numbers);

            //Then
            System.out.println(result);
            Assertions.assertEquals(1,result);
        }
    }
}
