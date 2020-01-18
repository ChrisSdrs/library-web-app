package com.library.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowModel {
    long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
    String status;
    String bookPin;
    String customerSsn;

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

    public void setBookPin(String bookTitle) {
        this.bookPin = bookPin;
    }

    public String getCustomerSsn() {
        return customerSsn;
    }

    public void setCustomerSsn(String customerSsn) {
        this.customerSsn = customerSsn;
    }

    public BorrowModel() {
    }

    public BorrowModel(long id, LocalDate date, String status, String bookPin, String customerSsn) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.bookPin = bookPin;
        this.customerSsn = customerSsn;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Borrow{");
        sb.append("id=").append(id);
        sb.append(", borrowDate=").append(date);
        sb.append(", status=").append(status);
        sb.append(", bookPin=").append(bookPin);
        sb.append(", customerSsn=").append(customerSsn);
        sb.append('}');
        return sb.toString();
    }
}
