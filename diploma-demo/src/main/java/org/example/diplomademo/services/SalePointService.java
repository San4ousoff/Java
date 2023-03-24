package org.example.diplomademo.services;

import org.example.diplomademo.entities.SalePoint;

import java.util.List;
import java.util.Optional;

public interface SalePointService {
    List<SalePoint> getAllSalePoint();
    SalePoint createSalePoint(SalePoint salePoint);
    void updateSalePoint(SalePoint salePoint);
    void deleteSalePoint(SalePoint salePoint);
    Optional<SalePoint> getSalePointById(long id);
    List<SalePoint> getIdByName(String name);
}
