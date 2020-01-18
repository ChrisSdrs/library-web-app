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

    @GetMapping(value = "/admin/properties/create")
    public String createProperty(Model model) {

        model.addAttribute(BOOK_FORM, new BookForm());
        return "pages/property_create";
    }

    @PostMapping(value = "/admin/properties/create")
    public String createProperty(Model model,
                                 @Valid @ModelAttribute(BOOK_FORM)
                                         BookForm bookForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/property_create";
        }

        Book book = mapper.toBook(bookForm);
        if(isValidBookEmptyFields(book)) {
            if (isValidBook(book) == "") {
                bookService.createBook(book);
                redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Book Created Successfully!");
                return "redirect:/admin/properties";
            }
            else {
                model.addAttribute(BOOK_CREATE_ERROR, isValidBook(book));
                return "pages/property_create";
            }
        }else{
            model.addAttribute(BOOK_CREATE_ERROR, "Please fill all fields!");
            return "pages/property_create";
        }

    }


    private String isValidBook(Book book) {
        String result = "";
        String pin = book.getPin();
        //Book provided is not Valid if pin already exists
        if (!bookService.findByPin(pin).isEmpty()) {
            result += "Pin Already Exists. ";
        }
        return result;
    }


    private boolean isValidBookEmptyFields(Book book){
        boolean isValid   = true;
        String pin = book.getPin();
        String title = book.getTitle();
        String category = book.getCategory();
//        String publicationDate = book.getPublicationDate();
        if (pin.isEmpty() || title.isEmpty() || category.isEmpty()){
            isValid = false;
        }
        return isValid;
    }


}