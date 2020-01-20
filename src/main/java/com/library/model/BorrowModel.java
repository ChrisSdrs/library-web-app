package com.library.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowModel {
    long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String bookPin;
    String membNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public BorrowModel() {
    }

    public BorrowModel(long id, LocalDate date, String status, String bookPin, String membNumber) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.bookPin = bookPin;
        this.membNumber = membNumber;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Borrow{");
        sb.append("id=").append(id);
        sb.append(", borrowDate=").append(date);
        sb.append(", status=").append(status);
        sb.append(", bookPin=").append(bookPin);
        sb.append(", membership_number=").append(membNumber);
        sb.append('}');
        return sb.toString();
    }
}
