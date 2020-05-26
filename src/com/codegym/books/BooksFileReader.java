package com.codegym.books;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class BooksFileReader implements IBooksReader {

    private String path;

    void setPath(String path) {
        this.path = path;
    }

    @Override
    public List<Book> read() {
        List<Book> books = new ArrayList<>();
        try {

            File myFile = new File(path);
            FileInputStream inputStream = new FileInputStream(myFile);
            while (inputStream.read() != -1) {
                //
            }
        }
        catch (Exception e) {

        }
        return books;
    }
}
