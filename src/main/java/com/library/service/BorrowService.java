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

    List<BorrowModel> findByMembNumber(String membNumber);

    List<BorrowModel> findByBookPin(String bookPin);

    List<BorrowModel> findByDateAfter(LocalDate date);

    List<BorrowModel> findByReturnDate(LocalDate returnDate);

    List<BorrowModel> findByDateBefore(LocalDate date);

    List<BorrowModel> findByMembNumberAndDateAfter(String membNumber, LocalDate dateAfter);

    List<BorrowModel> findByMembNumberAndDateBefore(String membNumber, LocalDate dateBefore);

    List<BorrowModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<BorrowModel> findByMembNumberAndDateBetween(String membNumber, LocalDate dateBefore, LocalDate dateAfter);

    List<BorrowModel> findTop10ByDateOrderByDateAsc(LocalDate dateBefore);
}
