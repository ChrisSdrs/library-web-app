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


    @PostMapping(value = "/admin/repairs/{id}/delete")
    public String deleteRepair(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        borrowService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Borrow Deleted Successfully!");
        return "redirect:/admin/repairs";
    }

    @PostMapping(value = "/admin/repairs/{id}/edit")
    public String editRepair(@PathVariable Long id, Model model) {
        BorrowModel borrowModel = borrowService.findById(id).get();
        model.addAttribute(BORROW_FORM, new BorrowForm());
        model.addAttribute(BORROW, borrowModel);
        return "pages/repair_edit";
    }

    @PostMapping(value = "/admin/repairs/edit")
    public String editRepair(BorrowModel borrowModel, RedirectAttributes redirectAttrs) {
        borrowService.updateBorrow(borrowModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Borrow Edited successfully!");
        return "redirect:/admin/repairs";
    }
}
