package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library: first");

        Book book1 = new Book("Games of Thrones 1", "Martin",
                LocalDate.of(2015, 12, 31));
        Book book2 = new Book("Games of Thrones 2", "Martin",
                LocalDate.of(2016, 12, 31));
        Book book3 = new Book("Games of Thrones 3", "Martin",
                LocalDate.of(2017, 12, 31));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch",
                LocalDate.of(1971, 2, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library: second");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary=null;
        try{
            deepCloneLibrary=library.deepCopy();
            deepCloneLibrary.setName("Library: third");}
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(3, cloneLibrary.getBooks().size());
        Assertions.assertEquals(4, deepCloneLibrary.getBooks().size());

    }


}