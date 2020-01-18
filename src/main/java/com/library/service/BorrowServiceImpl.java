package com.library.service;

import com.library.domain.Borrow;
import com.library.mappers.BorrowToBorrowModelMapper;
import com.library.model.BorrowModel;
import com.library.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowRepository borrowRepository;

    @Autowired
    private BorrowToBorrowModelMapper mapper;

    @Override
    public Borrow createBorrow(Borrow borrow) {
        return borrowRepository.save(borrow);
    }
    @Override
    public Borrow updateBorrow(BorrowModel borrowModel) {
        Borrow originalBorrow = borrowRepository.findById(borrowModel.getId()).get();
        originalBorrow.setDate(borrowModel.getDate());
        originalBorrow.setStatus(borrowModel.getStatus());
        originalBorrow.setBookPin(borrowModel.getBookPin());
        originalBorrow.setMember(borrowModel.getMember());

        return borrowRepository.save(originalBorrow);
    }

    @Override
    public void deleteById(Long id) {
        borrowRepository.deleteById(id);
    }

    @Override
    public Optional<BorrowModel> findById(Long id) {
        return borrowRepository.findById(id)
                .map(borrow -> mapper.mapToBorrowModel(borrow));
    }

    @Override
    public List<BorrowModel> findAll() {
        return borrowRepository.findAll()
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByMember(String member) {
        return borrowRepository.findByMember(member)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByBookPin(String bookPin) {
        return borrowRepository.findByBookPin(bookPin)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByDateAfter(LocalDate dateAfter) {
        return borrowRepository.findByDateAfter(dateAfter)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByDateBefore(LocalDate dateBefore) {
        return borrowRepository.findByDateBefore(dateBefore)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByMemberAndDateAfter(String member, LocalDate dateAfter) {
        return borrowRepository.findByMemberAndDateAfter(member, dateAfter)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByMemberAndDateBefore(String member, LocalDate dateBefore) {
        return borrowRepository.findByMemberAndDateBefore(member, dateBefore)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter) {
        return borrowRepository.findByDateBetween(dateBefore, dateAfter)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findByMemberAndDateBetween(String member, LocalDate dateBefore, LocalDate dateAfter) {
        return borrowRepository.findByMemberAndDateBetween(member, dateBefore, dateAfter)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }

    @Override
    public List<BorrowModel> findTop10ByDateOrderByDateAsc(LocalDate date) {
        return borrowRepository.findTop10ByDateOrderByDateAsc(date)
                .stream()
                .map(borrow -> mapper.mapToBorrowModel(borrow))
                .collect(Collectors.toList());
    }
}
