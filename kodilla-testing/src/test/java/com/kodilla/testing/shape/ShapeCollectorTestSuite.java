package com.kodilla.testing.shape;


import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

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
    @DisplayName("Test for list")
    class TestList {
        @DisplayName("when create ShapeCollector with figure, " +
                "then addFigure should add figure to the shapeList")
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector figure=new ShapeCollector();
            Circle circle=new Circle();
            figure.addFigure(circle);

            //When
            int result = figure.getShapeListSize();;

            //Then
            Assertions.assertEquals(1, result);
        }
        @DisplayName("when create ShapeCollector with figure and add figure to the shapeList, " +
                "then removeFigure should remove figure from the shapeList")
        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector figure=new ShapeCollector();
            Circle circle=new Circle();
            figure.addFigure(circle);
            figure.removeFigure(circle);

            //When
            int result = figure.getShapeListSize();;

            //Then
            Assertions.assertEquals(0, result);
        }
        @DisplayName("when create ShapeCollector with figure and add new figure to the shapeList, " +
                "then getFigure should get figure from the shapeList")
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector figure=new ShapeCollector();
            Circle circle=new Circle();
            figure.addFigure(circle);

            //When
            Shape result=figure.getFigure(0);

            //Then
            Assertions.assertEquals(circle, result);
        }
        @DisplayName("when create ShapeCollector with figure and add figures to the shapeList, " +
                "then showFigures should show all figures from the shapeList in one String")
        @Test
        void testShowFigures(){
            //Given
            ShapeCollector figure=new ShapeCollector();
            Circle circle=new Circle();
            Square square=new Square();
            Triangle triangle=new Triangle();
            figure.addFigure(circle);
            figure.addFigure(square);
            figure.addFigure(triangle);

            //When
            String result=figure.showFigures();
            String expectedResult="[circle, square, triangle]";

            //Then
            Assertions.assertEquals(expectedResult, result);
        }

    }

    @Nested
    @DisplayName("Test for Shape")
    class TestFields {
    }
}

