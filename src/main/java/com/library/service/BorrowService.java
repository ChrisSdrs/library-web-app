package com.library.service;

import com.library.domain.Borrow;
import com.library.model.BorrowModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface BorrowService {

    Borrow createBorrow(Borrow borrow);

    Borrow updateBorrow(BorrowModel borrowModel);

    void deleteById(Long id);

    Optional<BorrowModel> findById(Long id);

    List<BorrowModel> findAll();

    List<BorrowModel> findByCustomerSsn(String customerSsn);

    List<BorrowModel> findByBookPin(String bookPin);

    List<BorrowModel> findByDateAfter(LocalDate date);

    List<BorrowModel> findByDateBefore(LocalDate date);

    List<BorrowModel> findByCustomerSsnAndDateAfter(String customerSsn, LocalDate dateAfter);

    List<BorrowModel> findByCustomerSsnAndDateBefore(String customerSsn, LocalDate dateBefore);

    List<BorrowModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<BorrowModel> findByCustomerSsnAndDateBetween(String customerSsn, LocalDate dateBefore, LocalDate dateAfter);

    List<BorrowModel> findTop10ByDateOrderByDateAsc(LocalDate dateBefore);
}
