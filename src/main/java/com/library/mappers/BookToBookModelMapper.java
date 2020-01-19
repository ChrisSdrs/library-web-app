package com.library.mappers;

import com.library.domain.Book;
import com.library.model.BookModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class BookToBookModelMapper {

    public BookModel mapToBookModel(Book book) {
       BookModel bookModel = new BookModel();
       bookModel.setId(book.getId());
       bookModel.setBookPin(book.getBookPin());
       bookModel.setCategory(book.getCategory());
       bookModel.setTitle(book.getTitle());
       bookModel.setPublicationDate(book.getPublicationDate().toString());


        return bookModel;
    }
}
