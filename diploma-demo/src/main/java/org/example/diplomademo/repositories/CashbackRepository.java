package org.example.diplomademo.repositories;

import org.example.diplomademo.entities.Cashback;
import org.example.diplomademo.entities.SalePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashbackRepository extends JpaRepository<Cashback,Long> {
    List<Cashback> getValueBySalePoint(SalePoint salePoint);
    List<Cashback> getCardByValue(Integer value);
}
