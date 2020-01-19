package com.library.forms;

public class BookSearchForm {

    String bookPin;
    String category;

    public BookSearchForm() {
    }

    public BookSearchForm(String bookPin, String category) {
        this.bookPin = bookPin;
        this.category = category;
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
}
