package com.library.controller.borrow;

import com.library.forms.BorrowForm;
import com.library.model.BorrowModel;
import com.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.library.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.library.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class BorrowEditController {

    private static final String BORROW_FORM = "borrowForm";
    private static final String BORROW= "borrow";

    @Autowired
    private BorrowService borrowService;


    @PostMapping(value = "/admin/borrows/{id}/delete")
    public String deleteBorrow(@PathVariable Long id) {
        borrowService.deleteById(id);
        return "redirect:/admin/borrows";
    }

    @PostMapping(value = "/admin/borrows/{id}/edit")
    public String editBorrow(@PathVariable Long id, Model model) {
        BorrowModel borrowModel = borrowService.findById(id).get();
        model.addAttribute(BORROW_FORM, new BorrowForm());
        model.addAttribute(BORROW, borrowModel);
        return "pages/borrow_edit";
    }

    @PostMapping(value = "/admin/borrows/edit")
    public String editBorrow(BorrowModel borrowModel) {
        borrowService.updateBorrow(borrowModel);
        return "redirect:/admin/borrows";
    }
}
