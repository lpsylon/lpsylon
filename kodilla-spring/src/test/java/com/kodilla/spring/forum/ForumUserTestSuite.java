package com.kodilla.spring.forum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUserName();

        //Then
        Assert.assertEquals("John Smith", name);
    }
}
