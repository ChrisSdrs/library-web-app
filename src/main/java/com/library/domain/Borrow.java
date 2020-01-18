package com.library.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "borrow_date")
    private LocalDate date;

    @Column(name = "borrow_status")
    private String status;

    @Column(name = "book_pin")
    private String bookPin;

    @Column(name = "members_mn")
    private String member;


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

    public String getBookPin() {
        return bookPin;
    }

    public void setBookPin(String bookPin) {
        this.bookPin = bookPin;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public Borrow(){

    }


    public Borrow(LocalDate date, String status, String bookPin, String member) {
        this.date = date;
        this.status = status;
        this.bookPin = bookPin;
        this.member = member;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Borrow{");
        sb.append("id=").append(id);
        sb.append(", borrow_date='").append(date);
        sb.append(", status='").append(status);
        sb.append(", book_pin=").append(bookPin);
        sb.append(", membership_number=").append(member);
        sb.append('}');
        return sb.toString();
    }

}