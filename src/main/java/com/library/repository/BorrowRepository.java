package com.library.repository;

import com.library.domain.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

    Borrow save(Borrow borrow);

    void deleteById(long id);

    Optional<Borrow> findById(Long id);

    List<Borrow> findAll();

    List<Borrow> findByCustomerSsn(String customerSsn);

    List<Borrow> findByBookPin(String bookPin);

    List<Borrow> findByDateAfter(LocalDate dateAfter);

    List<Borrow> findByDateBefore(LocalDate dateBefore);

    List<Borrow> findByCustomerSsnAndDateAfter(String customerSsn, LocalDate dateAfter);

    List<Borrow> findByCustomerSsnAndDateBefore(String customerSsn, LocalDate dateBefore);

    List<Borrow> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<Borrow> findByCustomerSsnAndDateBetween(String customerSsn, LocalDate dateBefore, LocalDate dateAfter);

    List<Borrow> findTop10ByDateOrderByDateAsc(LocalDate date);


}
