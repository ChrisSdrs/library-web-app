package com.library.controller.book;

import com.library.model.BookModel;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    private static final String BOOK_LIST = "books";

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/admin/books")
    public String books(Model model) {
        List<BookModel> books = bookService.findAll();
        model.addAttribute(BOOK_LIST, books);
        return "pages/books_show";
    }
}
