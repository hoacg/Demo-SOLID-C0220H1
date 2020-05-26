package com.codegym.books;

public class BookPrinter {
    public void printConsole(Book book) {
        System.out.println("Tiêu đề: " + book.getTitle());
        System.out.println("Tác giả: " + book.getAuthors());
        System.out.println("Ảnh bìa: " + book.getCoverImage());
    }
}
