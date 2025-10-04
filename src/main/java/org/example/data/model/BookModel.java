package org.example.data.model;

public class BookModel {
    private String id;
    private String title;
    private String author;
    private String file_name;

    public BookModel(String id, String title, String author, String file_name) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.file_name = file_name;
    }

    public BookModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}

