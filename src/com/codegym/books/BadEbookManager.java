package com.codegym.books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BadEbookManager {

    List<Book> bookList = new ArrayList<>();
    BooksDatabaseReader booksFileReader = new BooksDatabaseReader();

    public BadEbookManager() {
    }



    void add(Book book) {}
    void edit(Book book) {}
    void remove(int id) {}
    void get(int id) {}

    void readFile(String path) throws IOException {
        bookList =  booksFileReader.read();
    }
    void writeFile(String path) {

    }

}
