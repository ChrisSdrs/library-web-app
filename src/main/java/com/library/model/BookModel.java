package com.library.model;


public class BookModel {

    private Long id;
    private String pin;
    private String title;
    private String publicationDate;
    private String category;



    public BookModel() {
    }

    public BookModel(Long id, String pin, String title, String publicationDate, String category) {
        this.id = id;
        this.pin = pin;
        this.title = title;
        this.publicationDate = publicationDate;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", pin='").append(pin);
        sb.append(", title='").append(title);
        sb.append(", category=").append(category);
        sb.append(", publication_date=").append(publicationDate);
        sb.append('}');

        return sb.toString();
    }
}
