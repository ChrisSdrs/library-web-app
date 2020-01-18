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

    List<BookModel> findByPin(String pin);

    List<BookModel> findByCategory(String category);

    List<BookModel> findByPinAndCategory(String pin, String category);
}
