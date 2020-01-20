package com.library.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowForm {

    Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String membNumber;
    String bookPin;


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

    public void setBookPin(String bookPin) { this.bookPin = bookPin;
    }


    public BorrowForm() {

    }

    public BorrowForm(Long id, LocalDate date, String status, String membNumber, String bookPin) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.membNumber = membNumber;
        this.bookPin = bookPin;
    }
}
