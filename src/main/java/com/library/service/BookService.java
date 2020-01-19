package com.library.service;


import com.library.domain.Book;
import com.library.model.BookModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    List<BookModel> findAll();

    Book createBook(Book book);

    Optional<BookModel> findById(Long id);

    Book updateBook(BookModel bookModel);

    void deleteById(Long id);

    List<BookModel> findByBookPin(String bookPin);

    List<BookModel> findByMembNumber(String membNumber);

    List<BookModel> findByCategory(String category);

    List<BookModel> findByBookPinAndCategory(String bookPin, String category);
}
