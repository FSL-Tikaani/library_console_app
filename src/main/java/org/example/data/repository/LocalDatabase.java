package org.example.data.repository;

import org.example.data.model.BookModel;

import java.util.List;

public class LocalDatabase implements BookRepository{

    @Override
    public List<BookModel> getAllBooks() {
        return List.of();
    }

    @Override
    public BookModel getBookFromId(int id) {
        return null;
    }
}
