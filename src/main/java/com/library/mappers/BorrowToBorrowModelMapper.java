package com.library.mappers;

import com.library.domain.Borrow;
import com.library.model.BorrowModel;
import org.springframework.stereotype.Component;

@Component
public class BorrowToBorrowModelMapper {

    public BorrowModel mapToBorrowModel(Borrow borrow) {
        BorrowModel borrowModel = new BorrowModel();
        borrowModel.setId(borrow.getId());
        borrowModel.setDate(borrow.getDate());
        borrowModel.setReturnDate(borrow.getReturnDate());
        borrowModel.setStatus(borrow.getStatus());
        borrowModel.setMembNumber(borrow.getMembNumber());
        borrowModel.setBookPin(borrow.getBookPin());
        return borrowModel;
    }
}
