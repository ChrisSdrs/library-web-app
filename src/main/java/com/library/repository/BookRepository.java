package com.library.repository;

import com.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book save(Book user);

    Optional<Book> findById(Long id);

    List<Book> findByPin(String pin);

    List<Book> findByCategory(String category);

    List<Book> findByPinAndCategory(String pin, String category);
}

