package com.library.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowForm {

    Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String member;
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

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getBookPin() {
        return bookPin;
    }

    public void setBookPin(String bookPin) { this.bookPin = bookPin;
    }


    public BorrowForm() {

    }

    public BorrowForm(Long id, LocalDate date, String status, String member, String bookPin) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.member = member;
        this.bookPin = bookPin;
    }
}
