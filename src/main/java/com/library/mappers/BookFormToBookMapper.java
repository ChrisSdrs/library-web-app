package com.library.mappers;

import com.library.domain.Book;
import com.library.forms.BookForm;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class BookFormToBookMapper {

    public Book toBook(BookForm bookForm){
        Book book = new Book();
        book.setBookPin(bookForm.getBookPin());
        book.setCategory(bookForm.getCategory());
        LocalDate date = LocalDate.parse(bookForm.getPublicationDate(),
                DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        book.setPublicationDate(date);        book.setTitle(bookForm.getTitle());

        return book;
    }

}
