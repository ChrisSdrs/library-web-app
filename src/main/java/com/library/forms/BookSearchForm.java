package com.library.forms;

public class BookSearchForm {

    String bookPin;
    String membNumber;

    public BookSearchForm() {
    }

    public BookSearchForm(String bookPin, String membNumber) {
        this.bookPin = bookPin;
        this.membNumber = membNumber;
    }

    public String getBookPin() {
        return bookPin;
    }

    public void setBookPin(String bookPin) {
        this.bookPin = bookPin;
    }

    public String getMembNumber() {
        return membNumber;
    }

    public void setMembNumber(String membNumber) {
        this.membNumber = membNumber;
    }
}
