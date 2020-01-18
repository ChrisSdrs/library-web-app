package com.library.forms;

public class BookForm {

    private Long id;
    private String pin;
    private String category;
    private String title;
    private String publicationDate;

    public BookForm() {
    }

    public BookForm(Long id, String pin, String category, String title, String publicationDate) {
        this.id = id;
        this.pin = pin;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

