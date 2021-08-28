package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {


    @Test
    public void testLogMethod() {
        //Given
        //When
        Logger.getInstance().log("test1");
        Logger.getInstance().log("test2");
        String lastLog = Logger.getInstance().getLastLog();

        //Then
     assertEquals(lastLog, "test2");
    }

}
