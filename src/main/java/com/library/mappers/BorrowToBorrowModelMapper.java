package com.library.mappers;

import com.library.domain.Borrow;
import com.library.model.BorrowModel;
import org.springframework.stereotype.Component;

@Component
public class BorrowToBorrowModelMapper {

    public BorrowModel mapToBorrowModel(Borrow borrow) {
        BorrowModel borrowModel = new BorrowModel();
        borrowModel.setId(borrow.getId());
        borrow.setDate(borrow.getDate());
        borrow.setStatus(borrow.getStatus());
        borrow.setMembNumber(borrow.getMembNumber());
        borrow.setBookPin(borrow.getBookPin());
        return borrowModel;
    }
}
