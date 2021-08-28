package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
       assertEquals(shopping.getTaskName(), "Buy car");

       assertEquals(shopping.isTaskExecuted(), false);
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask("PAINTING");
        //Then
    assertEquals(painting.getTaskName(), "Paint Mona Lisa");
      assertEquals(painting.isTaskExecuted(), false);
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
      assertEquals(driving.getTaskName(), "Go to London");
      assertEquals(driving.isTaskExecuted(), true);
    }
}
