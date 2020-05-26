package com.codegym.books;

public class BookApp {
    public static void main(String[] args) {
        BooksDatabaseReader booksReader = new BooksDatabaseReader();

        BookManager bookManager1 = new BookManager(booksReader);
        BookManager bookManager2 = new BookManager(booksReader);
        BookManager bookManager3 = new BookManager(booksReader);
        BookManager ebookManager = new BookManager(booksReader);
    }
}
