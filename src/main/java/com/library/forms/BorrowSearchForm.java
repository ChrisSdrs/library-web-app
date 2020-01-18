package com.library.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowSearchForm {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateTo;
    String member;

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

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public BorrowSearchForm() {
    }

    public BorrowSearchForm(LocalDate dateFrom, LocalDate dateTo, String member) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.member = member;
    }
}
