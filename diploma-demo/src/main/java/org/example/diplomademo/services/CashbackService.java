package org.example.diplomademo.services;

import org.example.diplomademo.entities.Cashback;
import org.example.diplomademo.entities.SalePoint;

import java.util.List;
import java.util.Optional;

public interface CashbackService {
    List<Cashback> getAllCashback();
    Cashback createCashback(Cashback cashback);
    void updateCashback(Cashback cashback);
    void deleteCashback(Cashback cashback);
    Optional<Cashback> getValueById(long id);
    List<Cashback> getValueBySalePoint(SalePoint salePoint);
    List<Cashback> getCardByValue(Integer value);
}
