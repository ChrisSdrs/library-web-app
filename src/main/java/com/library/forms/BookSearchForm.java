package com.library.forms;

public class BookSearchForm {

    String pin;
    String category;

    public BookSearchForm() {
    }

    public BookSearchForm(String pin, String category) {
        this.pin = pin;
        this.category = category;
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
}
