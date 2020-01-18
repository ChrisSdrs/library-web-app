package com.library.mappers;

import com.library.domain.Borrow;
import com.library.forms.BorrowForm;
import org.springframework.stereotype.Component;

@Component
public class BorrowFormToBorrowMapper {

    public Borrow mapToRepairModel(BorrowForm borrowForm) {
        Borrow borrow = new Borrow();
        borrow.setId(borrowForm.getId());
        borrow.setDate(borrowForm.getDate());
        borrow.setStatus(borrowForm.getStatus());
        borrow.setMember(borrowForm.getMember());
        borrow.setBookPin(borrowForm.getBookPin());
        return borrow;

    }
}
