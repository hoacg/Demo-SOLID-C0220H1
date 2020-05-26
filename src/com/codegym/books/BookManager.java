package com.codegym.books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> bookList = new ArrayList<>();
    private IBooksReader booksReader;

    public BookManager(IBooksReader booksReader) {
        this.booksReader = booksReader;
    }



    void add(Book book) {}
    void edit(Book book) {}
    void remove(int id) {}
    void get(int id) {}

    void readFile(String path) throws IOException {
        bookList =  booksReader.read();
    }
    void writeFile(String path) {

    }

}
