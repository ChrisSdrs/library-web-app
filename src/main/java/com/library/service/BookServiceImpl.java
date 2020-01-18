package com.library.service;


import com.library.domain.Book;
import com.library.mappers.BookToBookModelMapper;
import com.library.model.BookModel;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookToBookModelMapper mapper;


    @Override
    public List<BookModel> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(book -> mapper.mapToBookModel(book))
                .collect(Collectors.toList());
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<BookModel> findById(Long id) {
        return bookRepository.findById(id)
                .map(book -> mapper.mapToBookModel(book));
    }

    @Override
    public Book updateBook(BookModel bookModel){
        Book originalBook = bookRepository.findById(bookModel.getId()).get();
        originalBook.setPin(bookModel.getPin());
        originalBook.setTitle(bookModel.getTitle());
        originalBook.setCategory(bookModel.getCategory());
        return bookRepository.save(originalBook);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<BookModel> findByPin(String pin) {
        return bookRepository.findByPin(pin)
                .stream()
                .map(book -> mapper.mapToBookModel(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookModel> findByCategory(String category) {
        return bookRepository.findByCategory(category)
                .stream()
                .map(book -> mapper.mapToBookModel(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookModel> findByMember(String member) {
        return bookRepository.findByCategory(member)
                .stream()
                .map(book -> mapper.mapToBookModel(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookModel> findByPinAndCategory(String pin, String category) {
        return bookRepository.findByPinAndCategory(pin, category)
                .stream()
                .map(book -> mapper.mapToBookModel(book))
                .collect(Collectors.toList());
    }


}
