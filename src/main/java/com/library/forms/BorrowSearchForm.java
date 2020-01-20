package com.library.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowSearchForm {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateTo;
    String membNumber;

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getMembNumber() {
        return membNumber;
    }

    public void setMembNumber(String membNumber) {
        this.membNumber = membNumber;
    }

    public BorrowSearchForm() {
    }

    public BorrowSearchForm(LocalDate dateFrom, LocalDate dateTo, String membNumber) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.membNumber = membNumber;
    }
}
