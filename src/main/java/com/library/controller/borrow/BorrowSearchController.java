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

    @GetMapping(value = "/admin/repairs/search")
    public String searchRepairs(Model model) {
        model.addAttribute(SEARCH_BORROWS_FORM, new BorrowSearchForm());
        return "pages/repairs_search";
    }

    @PostMapping(value = "/admin/repairs/search")
    public String searchRepairs(Model model,
                                @Valid @ModelAttribute(SEARCH_BORROWS_FORM)
                                        BorrowSearchForm borrowSearchForm,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/repairs_search";
        }
        String customerSsn = borrowSearchForm.getCustomerSsn();
        LocalDate dateFrom = borrowSearchForm.getDateFrom();
        LocalDate dateTo = borrowSearchForm.getDateTo();

        List<BorrowModel> borrows = getBorrowsFromSearch(customerSsn,dateFrom,dateTo);
        model.addAttribute(BORROW_LIST, borrows);
        model.addAttribute(SEARCH_BORROWS_FORM, borrowSearchForm);
        return "pages/repairs_search_results";
    }

    private List<BorrowModel> getBorrowsFromSearch(String customerSsn, LocalDate dateFrom, LocalDate dateTo){
        if (customerSsn == ""){
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
                    return borrowService.findByCustomerSsn(customerSsn);
                }
                else{
                    return borrowService.findByCustomerSsnAndDateBefore(customerSsn, dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return borrowService.findByCustomerSsnAndDateAfter(customerSsn, dateFrom);
                }
                else{
                    return borrowService.findByCustomerSsnAndDateBetween(customerSsn, dateFrom, dateTo);
                }
            }
        }

    }

}
