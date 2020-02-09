package com.library.mappers;

import com.library.domain.Borrow;
import com.library.forms.BorrowForm;
import org.springframework.stereotype.Component;

@Component
public class BorrowFormToBorrowMapper {

    public Borrow mapToBorrowModel(BorrowForm borrowForm) {
        Borrow borrow = new Borrow();
        borrow.setId(borrowForm.getId());
        borrow.setDate(borrowForm.getDate());
        borrow.setReturnDate(borrowForm.getReturnDate());
        borrow.setStatus(borrowForm.getStatus());
        borrow.setMembNumber(borrowForm.getMembNumber());
        borrow.setBookTitle(borrowForm.getBookTitle());
        borrow.setBookPin(borrowForm.getBookPin());
        return borrow;

    }
}
