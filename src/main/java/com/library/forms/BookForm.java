package com.library.forms;

public class BookForm {

    private Long id;
    private String bookPin;
    private String category;
    private String title;
    private String publicationDate;

    public BookForm() {
    }

    public BookForm(Long id, String bookPin, String category, String title, String publicationDate) {
        this.id = id;
        this.bookPin = bookPin;
        this.category = category;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookPin() {
        return bookPin;
    }

    public void setBookPin(String bookPin) {
        this.bookPin = bookPin;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}

