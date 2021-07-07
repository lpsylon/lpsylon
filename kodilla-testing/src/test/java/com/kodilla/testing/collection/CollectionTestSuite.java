package com.kodilla.testing.collection;

import java.util.*;
import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;


public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }
    @DisplayName("Testing empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList=new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing"+listNumbers);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }
    @DisplayName("Testing list with numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(234,567,22,899,12,15,3,5));
        ArrayList<Integer> oddList=new ArrayList<Integer>(Arrays.asList(234,22,12));

        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+listNumbers);
        //Then
        Assertions.assertEquals(oddList,listNumbers);
    }
}