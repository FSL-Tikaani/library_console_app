package org.example.api;

import org.example.data.model.BookModel;
import org.example.data.repository.BookRepository;
import org.example.data.repository.LocalDatabase;

import java.util.List;

public class LibraryService {
    private final BookRepository bookRepository;

    public LibraryService(BookRepository bookRepository, LocalDatabase localDatabase) {
        this.bookRepository = bookRepository;
    }

    public boolean createBook(BookModel bookModel){
        // TODO: Нужна правильная обработка исключений!
        try {
            bookRepository.createBook(bookModel);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean editBook(BookModel bookModel){
        // TODO: Нужна правильная обработка исключений!
        try {
            bookRepository.editBook(bookModel);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<BookModel> getBooks(){
        return bookRepository.getBooks();
    }

    public List<BookModel> searchBookForTitle(String title){
        return bookRepository.searchBookForTitle(title);
    }

    public List<BookModel> searchBookForTags(List<String> tags){
        return bookRepository.searchBookForTags(tags);
    }
}
