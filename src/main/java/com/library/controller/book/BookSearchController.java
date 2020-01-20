package com.library.controller.book;

import com.library.forms.BookSearchForm;
import com.library.mappers.BookFormToBookMapper;
import com.library.model.BookModel;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class BookSearchController {

    private static final String BOOK_SEARCH_FORM = "bookSearchForm";
    private static final String BOOKS = "books";

    @Autowired
    private BookService bookService;

    @Autowired
    private BookFormToBookMapper mapper;

    @GetMapping(value = "/admin/books/search")
    public String searchBooks(Model model) {
        model.addAttribute(BOOK_SEARCH_FORM, new BookSearchForm());
        return "pages/books_search";
    }

    @PostMapping(value = "/admin/books/search")
    public String searchUsers(Model model,
                              @Valid @ModelAttribute(BOOK_SEARCH_FORM)
                                      BookSearchForm bookSearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/books_search";
        }
        String pin = bookSearchForm.getBookPin();
        String membNumber = bookSearchForm.getMembNumber();


        List<BookModel> books = getBooksFromSearch(pin, membNumber);
        model.addAttribute(BOOKS, books);
        model.addAttribute(BOOK_SEARCH_FORM, bookSearchForm);
        return "pages/books_search_results";
    }

    private List<BookModel> getBooksFromSearch(String bookPin, String membNumber){
        if (bookPin == ""){
            if (membNumber == ""){
                return bookService.findAll();
            }
            else{
                return bookService.findByCategory(membNumber);
            }
        }
        else{
            if (membNumber == ""){
                return bookService.findByBookPin(bookPin);
            }
            else{
                return bookService.findByBookPinAndMembNumber(bookPin,membNumber);
            }
        }
    }

}
