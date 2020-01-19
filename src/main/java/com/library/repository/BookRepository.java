package com.library.repository;

import com.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book save(Book book);

    Optional<Book> findById(Long id);

    List<Book> findByBookPin(String bookPin);

    List<Book> findByCategory(String category);

    List<Book> findByBookPinAndCategory(String bookPin, String category);
}

