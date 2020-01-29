package com.library.controller.book;

import com.library.domain.Book;
import com.library.forms.BookForm;
import com.library.mappers.BookFormToBookMapper;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import java.time.LocalDate;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class BookCreateController {

    private static final String BOOK_FORM = "bookForm";
    private static final String BOOK_CREATE_ERROR = "bookCreateError" ;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookFormToBookMapper mapper;

    @GetMapping(value = "/admin/books/create")
    public String createBook(Model model) {

        model.addAttribute(BOOK_FORM, new BookForm());
        return "pages/book_create";
    }

    @PostMapping(value = "/admin/books/create")
    public String createBook(Model model,
                                 @Valid @ModelAttribute(BOOK_FORM)
                                         BookForm bookForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/book_create";
        }

        Book book = mapper.toBook(bookForm);
        if(isValidBookEmptyFields(book)) {
            if (isValidBook(book) == "") {
                bookService.createBook(book);
                redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Book Created Successfully!");
                return "redirect:/admin/books";
            }
            else {
                model.addAttribute(BOOK_CREATE_ERROR, isValidBook(book));
                return "pages/book_create";
            }
        }else{
            model.addAttribute(BOOK_CREATE_ERROR, "Please fill all fields!");
            return "pages/book_create";
        }

    }


    private String isValidBook(Book book) {
        String result = "";
        String bookPin = book.getBookPin();
        //Book provided is not Valid if pin already exists
        if (!bookService.findByBookPin(bookPin).isEmpty()) {
            result += "Pin Already Exists. ";
        }
        return result;
    }


    private boolean isValidBookEmptyFields(Book book){
        boolean isValid   = true;
        String bookPin = book.getBookPin();
        LocalDate publicationDate = book.getPublicationDate();
        String title = book.getTitle();
        String category = book.getCategory();
//        String publicationDate = book.getPublicationDate();
        if (bookPin.isEmpty() || title.isEmpty() || category.isEmpty() || publicationDate == null){
            isValid = false;
        }
        return isValid;
    }


}
