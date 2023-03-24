package org.example.diplomademo.services;

import org.example.diplomademo.entities.Cashback;
import org.example.diplomademo.entities.SalePoint;
import org.example.diplomademo.repositories.CashbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class CashbackServiceImpl implements CashbackService {
    private final CashbackRepository cashbackRepository;
    @Autowired
    public CashbackServiceImpl(CashbackRepository cashbackRepository) { this.cashbackRepository = cashbackRepository; }

    @Transactional(readOnly = true)
    @Override
    public List<Cashback> getAllCashback() { return cashbackRepository.findAll(); }

    @Transactional
    @Override
    public Cashback createCashback(Cashback cashback) { return cashbackRepository.save(cashback); }

    @Transactional
    @Override
    public void updateCashback(Cashback cashback) { cashbackRepository.save(cashback); }

    @Transactional
    @Override
    public void deleteCashback(Cashback cashback) { cashbackRepository.delete(cashback); }

    @Transactional(readOnly = true)
    @Override
    public Optional<Cashback> getValueById(long id) { return cashbackRepository.findById(id); }

    @Transactional(readOnly = true)
    @Override
    public List<Cashback> getValueBySalePoint(SalePoint salePoint) { return cashbackRepository.getValueBySalePoint(salePoint); }

    @Override
    public List<Cashback> getCardByValue(Integer value) { return cashbackRepository.getCardByValue(value); }
}
