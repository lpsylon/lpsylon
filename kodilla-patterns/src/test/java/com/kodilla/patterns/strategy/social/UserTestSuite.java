package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenialsJoe = new Millenials("Joe");
        User yGenAnna = new YGeneration("Anna");
        User zGenPeter = new ZGeneration("Peter");

        //When
        String joePostInMedia = millenialsJoe.sharePost();
        String annaPostInMedia = yGenAnna.sharePost();
        String peterPostInMedia = zGenPeter.sharePost();

        //Then
//        Assert.assertEquals(joePostInMedia,"Published on Twitter");
//        Assert.assertEquals(annaPostInMedia,"Published on Facebook");
//        Assert.assertEquals(peterPostInMedia,"Published on Snapchat");

       assertEquals(joePostInMedia,"Published on Twitter");
       assertEquals(annaPostInMedia,"Published on Facebook");
       assertEquals(peterPostInMedia,"Published on Snapchat");
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenialsJoe = new Millenials("Joe");

        //When
        millenialsJoe.setSocialPublisher(new SnapchatPublisher());
        String joePostInMedia = millenialsJoe.sharePost();

        //Then
       assertEquals(joePostInMedia,"Published on Snapchat");
    }
}
