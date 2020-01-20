package com.library.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "book_pin")
    private String bookPin;

    @Column(name = "book_title")
    private String title;

    @Column(name = "publication_date")
    @DateTimeFormat
    private LocalDate publicationDate;

    @Column(name = "book_category")
    private String category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book() {
    }

    public Book(String bookPin, String title, LocalDate publicationDate, String category) {
        this.bookPin = bookPin;
        this.title = title;
        this.publicationDate = publicationDate;
        this.category = category;
    }


    public String getBookPin() { return bookPin; }

    public void setBookPin(String bookPin) { this.bookPin = bookPin; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
