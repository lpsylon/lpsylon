package com.kodilla.spring.portfolio;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;


@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToToDoList("Activity 1");
        board.addToInProgressList("Activity 2");
        board.addToDoneList("Activity 3");
        //Then
        Assert.assertEquals("Activity 1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Activity 2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Activity 3", board.getDoneList().getTasks().get(0));

    }
}
