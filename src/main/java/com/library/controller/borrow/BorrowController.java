package com.library.controller.borrow;

import com.library.model.BorrowModel;
import com.library.service.BorrowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BorrowController {
    private static final String BORROW_LIST = "borrows";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BorrowService borrowService;

    @GetMapping(value = "/admin/borrows")
    public String borrows(Model model) {
        List<BorrowModel> borrows = borrowService.findAll();
        model.addAttribute(BORROW_LIST, borrows);
        return "pages/borrows_show";
    }

    @GetMapping(value = "/admin")
    public String borrowsToday(Model model) {
        LocalDate dateToday = LocalDate.now();
        List<BorrowModel> borrows = borrowService.findTop10ByDateOrderByDateAsc(dateToday);
        model.addAttribute(BORROW_LIST, borrows);
        return "pages/admin";
    }



    public void findAll() {
        borrowService.findAll().forEach(borrow -> logger.info(borrow.toString()));
    }




}