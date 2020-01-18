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

    List<Borrow> findByMember(String member);

    List<Borrow> findByBookPin(String bookPin);

    List<Borrow> findByDateAfter(LocalDate dateAfter);

    List<Borrow> findByDateBefore(LocalDate dateBefore);

    List<Borrow> findByMemberAndDateAfter(String member, LocalDate dateAfter);

    List<Borrow> findByMemberAndDateBefore(String member, LocalDate dateBefore);

    List<Borrow> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<Borrow> findByMemberAndDateBetween(String member, LocalDate dateBefore, LocalDate dateAfter);

    List<Borrow> findTop10ByDateOrderByDateAsc(LocalDate date);


}
