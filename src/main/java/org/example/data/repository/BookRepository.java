package org.example.data.repository;

import org.example.data.model.BookModel;

import java.util.List;

public interface BookRepository {
    List<BookModel> getBooks();
    BookModel getBookFromId(int id);
    Boolean createBook(BookModel bookModel);
    Boolean editBook(BookModel bookModel);
    List<BookModel> searchBookForTitle(String title);
    List<BookModel> searchBookForTags(List<String> tags);
}
