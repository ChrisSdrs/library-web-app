package com.library.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowForm {

    @DateTimeFormat(pattern = "yyyy-MM-dd")


    Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate returnDate;

    String status;
    String membNumber;
    String bookPin;
    String bookTitle;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getReturnDate() { return returnDate; }

    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMembNumber() {
        return membNumber;
    }

    public void setMembNumber(String membNumber) {
        this.membNumber = membNumber;
    }

    public String getBookPin() {
        return bookPin;
    }

    public void setBookPin(String bookPin) { this.bookPin = bookPin; }

    public String getBookTitle() { return bookTitle; }

    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }

    public BorrowForm() {

    }

    public BorrowForm(Long id, LocalDate date, LocalDate returnDate, String status, String membNumber, String bookTitle, String bookPin) {
        this.id = id;
        this.date = date;
        this.returnDate = returnDate;
        this.status = status;
        this.membNumber = membNumber;
        this.bookPin = bookPin;
        this.bookTitle = bookTitle;
    }
}
