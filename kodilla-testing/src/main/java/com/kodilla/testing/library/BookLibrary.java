package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;


    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if ((titleFragment.length() < 3) || (resultList.size() > 20))  return bookList;
        return resultList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser user) {
        return libraryDatabase.listBooksInHandsOf(user);
    }

    public boolean addBookToUser(LibraryUser user, Book book) {
        return false;
    }

    public boolean removeBookFromUser(LibraryUser user, Book book) {
        return false;
    }
}
