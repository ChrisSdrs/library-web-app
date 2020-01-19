package com.library.controller.book;

import com.library.forms.BookForm;
import com.library.model.BookModel;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class BookEditController {


    private static final String BOOK_FORM = "bookForm";
    private static final String BOOK = "book";

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/admin/books/{id}/edit")
    public String editProperty(@PathVariable Long id, Model model, RedirectAttributes redirectAttrs) {
        BookModel bookModel = bookService.findById(id).get();
        model.addAttribute(BOOK_FORM, new BookForm());
        model.addAttribute(BOOK, bookModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Book Edited successfully!");
        return "pages/book_edit";
    }

    @PostMapping(value = "/admin/books/edit")
    public String editBook(BookModel bookModel) {
        bookService.updateBook(bookModel);
        return "redirect:/admin/books";
    }

    @PostMapping(value = "/admin/books/{id}/delete")
    public String deleteProperty(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        bookService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Book Deleted successfully!");
        return "redirect:/admin/books";
    }
}
