package com.library.controller.borrow;

import com.library.forms.BorrowSearchForm;
import com.library.mappers.BorrowFormToBorrowMapper;
import com.library.model.BorrowModel;
import com.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class BorrowSearchController {
    private static final String SEARCH_BORROWS_FORM = "searchBorrowForm";
    private static final String BORROW_LIST = "borrows";

    @Autowired
    private BorrowService borrowService;

    @Autowired
    private BorrowFormToBorrowMapper mapper;

    @GetMapping(value = "/admin/borrows/search")
    public String searchBorrows(Model model) {
        model.addAttribute(SEARCH_BORROWS_FORM, new BorrowSearchForm());
        return "pages/borrows_search";
    }

    @PostMapping(value = "/admin/borrows/search")
    public String searchBorrows(Model model,
                                @Valid @ModelAttribute(SEARCH_BORROWS_FORM)
                                        BorrowSearchForm borrowSearchForm,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/borrows_search";
        }
        String membNumber = borrowSearchForm.getMembNumber();
        LocalDate dateFrom = borrowSearchForm.getDateFrom();
        LocalDate dateTo = borrowSearchForm.getDateTo();

        List<BorrowModel> borrows = getBorrowsFromSearch(membNumber,dateFrom,dateTo);
        model.addAttribute(BORROW_LIST, borrows);
        model.addAttribute(SEARCH_BORROWS_FORM, borrowSearchForm);
        return "pages/borrows_search_results";
    }

    private List<BorrowModel> getBorrowsFromSearch(String membNumber, LocalDate dateFrom, LocalDate dateTo){
        if (membNumber == ""){
            if (dateFrom == null){
                if (dateTo == null){
                    return borrowService.findAll();
                }
                else{
                    return borrowService.findByDateBefore(dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return borrowService.findByDateAfter(dateFrom);
                }
                else{
                    return borrowService.findByDateBetween(dateFrom, dateTo);
                }
            }
        }
        else{
            if (dateFrom == null){
                if (dateTo == null){
                    return borrowService.findByMembNumber(membNumber);
                }
                else{
                    return borrowService.findByMembNumberAndDateBefore(membNumber, dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return borrowService.findByMembNumberAndDateAfter(membNumber, dateFrom);
                }
                else{
                    return borrowService.findByMembNumberAndDateBetween(membNumber, dateFrom, dateTo);
                }
            }
        }

    }

}
