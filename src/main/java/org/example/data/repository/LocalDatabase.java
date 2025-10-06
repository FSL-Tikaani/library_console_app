package org.example.data.repository;

import org.example.data.model.BookModel;

import java.util.List;

public class LocalDatabase implements BookRepository{

    @Override
    public List<BookModel> getBooks() {
        return List.of();
    }

    @Override
    public BookModel getBookFromId(int id) {
        return null;
    }

    @Override
    public Boolean createBook(BookModel bookModel) {
        return true;
    }

    @Override
    public Boolean editBook(BookModel bookModel) {
        return null;
    }

    @Override
    public List<BookModel> searchBookForTitle(String request) {
        return List.of();
    }

    @Override
    public List<BookModel> searchBookForTags(List<String> tags) {
        return List.of();
    }
}
