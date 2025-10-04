package org.example.data.repository;

import org.example.data.model.BookModel;

import java.util.List;

public interface BookRepository {
    List<BookModel> getAllBooks();
    BookModel getBookFromId(int id);
}
