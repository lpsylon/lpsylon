package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTestSuite {
    @Test
    public void testGetBooksShallow() {

        //Given
        Library newLibrary = new Library("My Library");
        Set<Book> libraryBooks = newLibrary.getBooks();

        //When
        Book got1 = new Book("Games of Thrones 1", "Martin", LocalDate.of(2015, 12, 31));
        Book got2 = new Book("Games of Thrones 2", "Martin", LocalDate.of(2016, 12, 31));
        Book got3 = new Book("Games of Thrones 3", "Martin", LocalDate.of(2017, 12, 31));

        libraryBooks.add(got1);
        libraryBooks.add(got2);
        libraryBooks.add(got3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = newLibrary.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
      assertTrue(clonedLibrary.getBooks().contains(got1));
        assertTrue(clonedLibrary.getName() == "Cloned Library");
      assertTrue(clonedLibrary.getBooks().size() == 3);
    }

    @Test
    public void testGetBooksDeep() {

        //Given
        Library newLibrary = new Library("My Library");
        Set<Book> libraryBooks = newLibrary.getBooks();

        //When
        Book got1 = new Book("Games of Thrones 1", "Martin", LocalDate.of(2015, 12, 31));
        Book got2 = new Book("Games of Thrones 2", "Martin", LocalDate.of(2016, 12, 31));
        Book got3 = new Book("Games of Thrones 3", "Martin", LocalDate.of(2017, 12, 31));
        Book got4 = new Book("Games of Thrones 4", "Martin", LocalDate.of(2018, 12, 31));

        libraryBooks.add(got1);
        libraryBooks.add(got2);
        libraryBooks.add(got3);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = newLibrary.deepCopy();
            deepClonedLibrary.getBooks().add(got4);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertTrue(deepClonedLibrary.getBooks().size() == 4);
      assertTrue(deepClonedLibrary.getBooks().contains(got4));
    }
}