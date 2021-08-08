package com.kodilla.testing.shape;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Random;

public class ShapeCollectorTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeEach
    public   void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterEach
    public   void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        int collectionSizeBefore = collector.getShapeList().size();
        //When
        Shape newShape = new Circle(15);
        collector.addFigure(newShape);
        //Then
        int collectionSizeAfter = collector.getShapeList().size();
        if((collectionSizeBefore < collectionSizeAfter) && (collector.getFigure((collectionSizeAfter - 1)).equals(newShape))){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Adding figure ERROR");
        }
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        for (int i = 1; i < 100; i++) {
            Shape newShape = new Circle(15);
            collector.addFigure(newShape);
        }
        //When
        Random rnd = new Random();
        int j = rnd.nextInt(100);
        Shape shapeToRemove = new Circle(15);
        collector.removeFigure(shapeToRemove);
        //Then
        List<Shape> collectionSizeAfter = collector.getShapeList();
        Boolean shapeIsRemoved = true;
        for(Shape entry :collectionSizeAfter) {
            if (entry.equals(shapeToRemove)) {
                shapeIsRemoved = false;
            }
        }
        if(shapeIsRemoved){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Removing figure ERROR");
        }
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        for (int i = 1; i < 100; i++) {
            Shape newShape = new Circle(15);
            collector.addFigure(newShape);
        }
        //When
        Random rnd = new Random();
        int j = rnd.nextInt(100);
        Shape shapeToGet = new Circle(15);
        //Then
        if(collector.getFigure(j).equals(shapeToGet)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Getting figure ERROR");
        }
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        for (int i = 1; i < 100; i++) {
            Shape newShape = new Circle(15);
            collector.addFigure(newShape);
        }
        String entry = "";
        for(Shape shape :collector.getShapeList()) {
            entry += (shape+"\n");
        }
        //When
        String exit = collector.showFigures();
        //Then
        if(entry == exit) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Showing figure ERROR");
        }
    }
    @Test
    public void checkCircleFieldCalc(){
        //Given
        Random rnd = new Random();
        double radius = rnd.nextDouble()*100;
        double exptdField = Math.PI*Math.pow(radius, 2);
        //When
        Shape newShape = new Circle(radius);
        //Then
        if(newShape.getField() == exptdField) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Circle field calculations ERROR");
        }
    }
    @Test
    public void checkSquareFieldCalc(){
        //Given
        Random rnd = new Random();
        double a = rnd.nextDouble()*100;
        double exptdField = Math.pow(a, 2);
        //When
        Shape newShape = new Square(a);
        //Then
        if(newShape.getField() == exptdField) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Circle field calculations ERROR");
        }
    }
    @Test
    public void checkTriangleFieldCalc(){
        //Given
        Random rnd = new Random();
        double a = rnd.nextDouble()*100;
        double h = rnd.nextDouble()*100;
        double exptdField = a*h/2;
        //When
        Shape newShape = new Triangle(a, h);
        //Then
        if(newShape.getField() == exptdField) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Circle field calculations ERROR");
        }
    }
}
