package com.kodilla.exception.io;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {
    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }
    @Test
    @Disabled
    void whenFileDosentExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile( ));
    }
    @Test
    @Disabled
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile( )),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile( )),
                () -> assertDoesNotThrow(() -> fileReader.readFile( ))
        );
    }

}
